/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import CrudUserProfileController.LoginController;
import CrudUserProfileModel.User;
import Serializable.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gisward
 */
public class FoodList 
{
    URL foodFileURL;
    File foodFile;
    Scanner in;
    ArrayList<Food> parentFoodList;
    Food newFood;
    User currentUser;
    ArrayList<Integer> foodRowsFound;
    ArrayList<Integer> foodCategoryRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public static String STORAGE_FILE_PATH = "";

    public FoodList(User currentUser) 
    {
        this.currentUser = currentUser;
        this.STORAGE_FILE_PATH = "data/" + this.currentUser.getEmail() + "-food.ser";
        this.parentFoodList = SerializedDataCntl.getSerializedDataCntl().getFoodList();
        if (this.parentFoodList.isEmpty()) 
        {
            buildTestFoodList();
            //readDrinkFile();
        }
    }
    
    public void buildTestFoodList()
    {
        this.parentFoodList = new ArrayList();
        
        Food hamburger = new Food("Hamburger", 5, "14 hr");
        Food spaghetti = new Food("Spaghetti", 16, "5 hr");
        Food sandwich = new Food("Sandwich", 3, "30 min");
        Food strawberries = new Food("Strawberries", 8, "2 min");
        
        this.parentFoodList.add(hamburger);
        this.parentFoodList.add(spaghetti);
        this.parentFoodList.add(sandwich);
        this.parentFoodList.add(strawberries);
        
        System.out.println();
        this.printParentFoodList();
        this.save();
    }
    
    public void add(Food theFoodToAdd) {
        parentFoodList.add(theFoodToAdd);
        save();
    }
    
    public Food get(int row) {
        return this.parentFoodList.get(row);
    }
    
    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(this.parentFoodList, STORAGE_FILE_PATH);
    }
    
    public ArrayList<Food> getParentFoodList()
    {
        if(this.parentFoodList == null)
        {
            this.buildTestFoodList();
            //this.readFoodFile();
        }
        
        return parentFoodList;
    }
    
    public void setListOfFoods(ArrayList<Food> theListOfFoods) 
    {
        this.parentFoodList = theListOfFoods;
    }
    
    public void printParentFoodList()
    {
        for(int i = 0; i < parentFoodList.size(); i++)
        {
            System.out.println(parentFoodList.get(i).getFoodDetails());
        }
        System.out.println(parentFoodList.size());
    }
    
    public boolean requestSearchFoodList(String foodToSearch)
    {
        boolean searchedFoodFound;
        int foodsFound = 0;        
        this.foodRowsFound = new ArrayList();
        foodToSearch = foodToSearch.toLowerCase();
        
        for(int i = 0; i < this.parentFoodList.size(); i++)
        {
            String foodName = this.parentFoodList.get(i).getName().toLowerCase();
            
            if(foodName.contains(foodToSearch) || foodName.equalsIgnoreCase(foodToSearch))
            {
                foodsFound++;
                this.foodRowsFound.add(i);
            }
        }    
        
        searchedFoodFound = foodsFound > 0;
        
        return searchedFoodFound;
    }
    
    public ArrayList<Integer> getListOfFoodRowsFound()
    {
        return this.foodRowsFound;
    }
}
