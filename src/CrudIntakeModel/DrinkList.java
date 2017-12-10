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
    
    public static String STORAGE_FILE_PATH = "data/" + LoginController.getCurrentUser() +"-drink.ser";

    public DrinkList() 
    {
        this.parentDrinkList = SerializedDataCntl.getSerializedDataCntl().getDrinkList();
        if (this.parentDrinkList.isEmpty()) 
        {
            readDrinkFile();
        }
    }
    
    public void readDrinkFile() 
    {
        this.parentDrinkList = new ArrayList<>();
        
        try
        {
            this.drinkFileURL = getClass().getResource("Drink.csv");
            this.drinkFile = new File(this.drinkFileURL.getPath());
            
            boolean cont = true;
            in = new Scanner(this.drinkFile);

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String temp = in.nextLine();
                    String[] newD = temp.split(COMMA_DELIMITER);
                    
                    if (newD.length > 0) {
                        this.newDrink = new Drink(newD[0], Double.valueOf(newD[1]), newD[2]);
                        this.parentDrinkList.add(this.newDrink);
                    }
                }
                else
                {
                    cont = false;
                    System.out.println("Reading drink file done.");
                }   
            }
            SerializedDataCntl.getSerializedDataCntl().setList(this.parentDrinkList, STORAGE_FILE_PATH);
            //printParentDrinkList();
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

    public ArrayList<Drink> getParentDrinkList()
    {
        if(this.parentDrinkList == null)
        {
            this.readDrinkFile();
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
