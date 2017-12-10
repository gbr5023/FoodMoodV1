/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodRecModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import Serializable.*;

/**
 *
 * @author Gisward
 */
public class FoodRecList 
{
    URL foodRecFileURL;
    File foodRecFile;
    Scanner in;
    ArrayList<FoodRec> parentFoodRecList;
    FoodRec newFoodRec;
    ArrayList<Integer> foodRecRowsFound;
    ArrayList<Integer> foodRecCategoryRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public static String STORAGE_FILE_PATH = "data/foodRec.ser";
    
    public FoodRecList()
    {
        this.parentFoodRecList = SerializedDataCntl.getSerializedDataCntl().getFoodRecList();
        if (this.parentFoodRecList.isEmpty()) 
        {
            readFoodRecFile();
        }
    }
    
    public void readFoodRecFile() 
    {
        this.parentFoodRecList = new ArrayList<>();
        
        try
        {
            this.foodRecFileURL = getClass().getResource("HealthyFood.csv");
            this.foodRecFile = new File(this.foodRecFileURL.getPath());
            
            boolean cont = true;
            in = new Scanner(this.foodRecFile);

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String temp = in.nextLine();
                    String[] newFR = temp.split(COMMA_DELIMITER);
                    
                    if (newFR.length > 0) {
                        this.newFoodRec = new FoodRec(newFR[0], newFR[1]);
                        this.parentFoodRecList.add(this.newFoodRec);
                    }
                }
                else
                {
                    cont = false;
                    System.out.println("Reading food rec file done.");
                }   
            }
            SerializedDataCntl.getSerializedDataCntl().setList(this.parentFoodRecList, STORAGE_FILE_PATH);
            //printParentFoodRecList();
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
    
    public ArrayList<FoodRec> getParentFoodRecList()
    {
        if(this.parentFoodRecList == null)
        {
            this.readFoodRecFile();
        }
        
        return parentFoodRecList;
    }
    
    public void setListOfFoodRecs(ArrayList<FoodRec> theListOfFoodRecs) 
    {
        this.parentFoodRecList = theListOfFoodRecs;
    }
    
    public void printParentFoodRecList()
    {
        for(int i = 0; i < parentFoodRecList.size(); i++)
        {
            System.out.println(parentFoodRecList.get(i).getFoodRecDetails());
        }
        System.out.println(parentFoodRecList.size());
    }
    
    public boolean requestSearchFoodRecList(String foodRecToSearch)
    {
        boolean searchedFoodRecFound;
        int foodRecsFound = 0;        
        this.foodRecRowsFound = new ArrayList();
        foodRecToSearch = foodRecToSearch.toLowerCase();
        
        for(int i = 0; i < this.parentFoodRecList.size(); i++)
        {
            String foodRecName = this.parentFoodRecList.get(i).getFoodRec().toLowerCase();
            
            if(foodRecName.contains(foodRecToSearch) || foodRecName.equalsIgnoreCase(foodRecToSearch))
            {
                foodRecsFound++;
                this.foodRecRowsFound.add(i);
            }
        }    
        
        searchedFoodRecFound = foodRecsFound > 0;
        
        return searchedFoodRecFound;
    }
    
    public boolean requestSearchFoodRecListCategory(String foodRecCategoryToSearch)
    {
        boolean searchedFoodRecCategoryFound;
        int foodRecCategoriesFound = 0;        
        this.foodRecCategoryRowsFound = new ArrayList();
        foodRecCategoryToSearch = foodRecCategoryToSearch.toLowerCase();
        
        for(int i = 0; i < this.parentFoodRecList.size(); i++)
        {
            String foodRecCategory = this.parentFoodRecList.get(i).getFoodRecCategory().toLowerCase();
            
            if(foodRecCategory.contains(foodRecCategoryToSearch) || foodRecCategory.equalsIgnoreCase(foodRecCategoryToSearch))
            {
                foodRecCategoriesFound++;
                this.foodRecCategoryRowsFound.add(i);
            }
        }    
        
        searchedFoodRecCategoryFound = foodRecCategoriesFound > 0;
        
        return searchedFoodRecCategoryFound;
    }
    
    public ArrayList<Integer> getListOfFoodRecRowsFound()
    {
        return this.foodRecRowsFound;
    }
    
    public ArrayList<Integer> getListOfFoodRecCategoryRowsFound()
    {
        return this.foodRecCategoryRowsFound;
    }
}
