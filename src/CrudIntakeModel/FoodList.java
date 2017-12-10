/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import CrudUserProfileController.LoginController;
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
    ArrayList<Integer> foodRowsFound;
    ArrayList<Integer> foodCategoryRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public static String STORAGE_FILE_PATH = "data/" + LoginController.getCurrentUser() +"-food.ser";

    public FoodList() 
    {
        this.parentFoodList = SerializedDataCntl.getSerializedDataCntl().getFoodList();
        if (this.parentFoodList.isEmpty()) 
        {
            readFoodFile();
        }
    }
    
    public void readFoodFile() 
    {
        this.parentFoodList = new ArrayList<>();
        
        try
        {
            this.foodFileURL = getClass().getResource("Food.csv");
            this.foodFile = new File(this.foodFileURL.getPath());
            
            boolean cont = true;
            in = new Scanner(this.foodFile);

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String temp = in.nextLine();
                    String[] newF = temp.split(COMMA_DELIMITER);
                    
                    if (newF.length > 0) {
                        this.newFood = new Food(newF[0], Double.valueOf(newF[1]), newF[2]);
                        this.parentFoodList.add(this.newFood);
                    }
                }
                else
                {
                    cont = false;
                    System.out.println("Reading food file done.");
                }   
            }
            SerializedDataCntl.getSerializedDataCntl().setList(this.parentFoodList, STORAGE_FILE_PATH);
            //printParentFoodList();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe.getMessage());
        }
        catch(Exception err)
        {
            
            System.out.println(err.getMessage());
        }
    }
    
    public ArrayList<Food> getParentFoodList()
    {
        if(this.parentFoodList == null)
        {
            this.readFoodFile();
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
