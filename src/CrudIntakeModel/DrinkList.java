/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import CrudUserProfileController.LoginController;
import Serializable.SerializedDataCntl;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author Gisward
 */
public class DrinkList 
{
    URL drinkFileURL;
    File drinkFile;
    Scanner in;
    ArrayList<Drink> parentDrinkList;
    Drink newDrink;
    ArrayList<Integer> drinkRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + LoginController.getCurrentUser() + "-drink.ser";

    public DrinkList() 
    {
        this.parentDrinkList = SerializedDataCntl.getSerializedDataCntl().getDrinkList();
        if (this.parentDrinkList.isEmpty()) 
        {
            buildTestDrinkList();
            //readDrinkFile();
        }
    }
    
    public void buildTestDrinkList()
    {
        this.parentDrinkList = new ArrayList();
        
        Drink juice = new Drink("Juice", 16, "2 hr");
        Drink beer = new Drink("Beer", 8, "12 hr");
        Drink tea = new Drink("Tea", 6, "20 min");
        Drink water = new Drink("Water", 16, "5 min");
        
        this.parentDrinkList.add(juice);
        this.parentDrinkList.add(beer);
        this.parentDrinkList.add(tea);
        this.parentDrinkList.add(water);
        
        System.out.println();
        this.printParentDrinkList();
        this.save();
    }
    
    public void add(Drink theDrinkToAdd) {
        parentDrinkList.add(theDrinkToAdd);
        save();
    }
    
    public Drink get(int row) {
        return this.parentDrinkList.get(row);
    }
    
    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(this.parentDrinkList, STORAGE_FILE_PATH);
    }

    public ArrayList<Drink> getParentDrinkList()
    {
        if(this.parentDrinkList == null)
        {
            this.buildTestDrinkList();
            //this.readDrinkFile();
        }
        
        return parentDrinkList;
    }
    
    public void setListOfDrinks(ArrayList<Drink> theListOfDrinks) 
    {
        this.parentDrinkList = theListOfDrinks;
    }
    
    public void printParentDrinkList()
    {
        for(int i = 0; i < parentDrinkList.size(); i++)
        {
            System.out.println(parentDrinkList.get(i).getDrinkDetails());
        }
        System.out.println(parentDrinkList.size());
    }
    
    public boolean requestSearchDrinkList(String drinkToSearch)
    {
        boolean searchedDrinkFound;
        int drinksFound = 0;        
        this.drinkRowsFound = new ArrayList();
        drinkToSearch = drinkToSearch.toLowerCase();
        
        for(int i = 0; i < this.parentDrinkList.size(); i++)
        {
            String drinkName = this.parentDrinkList.get(i).getName().toLowerCase();
            
            if(drinkName.contains(drinkToSearch) || drinkName.equalsIgnoreCase(drinkToSearch))
            {
                drinksFound++;
                this.drinkRowsFound.add(i);
            }
        }    
        
        searchedDrinkFound = drinksFound > 0;
        
        return searchedDrinkFound;
    }
    
    public ArrayList<Integer> getListOfDrinkRowsFound()
    {
        return this.drinkRowsFound;
    }
}
