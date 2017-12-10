/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudMoodModel;

import CrudUserProfileController.LoginController;
import Serializable.SerializedDataCntl;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gisward
 */
public class MoodList 
{
    URL moodFileURL;
    File moodFile;
    Scanner in;
    ArrayList<Mood> parentMoodList;
    Mood newMood;
    ArrayList<Integer> moodRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + LoginController.getCurrentUser() + "-mood.ser";
    
    public MoodList() 
    {
        this.parentMoodList = SerializedDataCntl.getSerializedDataCntl().getMoodList();
        if (this.parentMoodList.isEmpty()) 
        {
            buildTestDrinkList();
        }
    }
    
    public void buildTestDrinkList()
    {
        this.parentMoodList = new ArrayList();
        
        Mood juice = new Mood("Sleepy", "Juice");
        Mood hamburger = new Mood("HYper", "Hamburger");
        Mood beer = new Mood("Exhausted", "Beer");
        Mood spaghetti = new Mood("Tired", "Spaghetti");
        Mood tea = new Mood("Happy", "Tea");
        Mood sandwich = new Mood("Angry", " Sandwich");
        Mood water = new Mood("Excited", "Water");
        Mood strawberries = new Mood("Depresssed", "Strawberries");
        
        
        this.parentMoodList.add(juice);
        this.parentMoodList.add(beer);
        this.parentMoodList.add(tea);
        this.parentMoodList.add(water);
        
        this.parentMoodList.add(hamburger);
        this.parentMoodList.add(spaghetti);
        this.parentMoodList.add(sandwich);
        this.parentMoodList.add(strawberries);
        
        System.out.println();
        this.printParentMoodList();
        this.save();
    }
    
    public void add(Mood theMoodToAdd) {
        parentMoodList.add(theMoodToAdd);
        save();
    }
    
    public Mood get(int row) {
        return this.parentMoodList.get(row);
    }
    
    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(this.parentMoodList, STORAGE_FILE_PATH);
    }
    
    public ArrayList<Mood> getParentMoodList()
    {
        if(this.parentMoodList == null)
        {
            this.buildTestDrinkList();
        }
        
        return parentMoodList;
    }
    
    public void setListOfMoods(ArrayList<Mood> theListOfMoods) 
    {
        this.parentMoodList = theListOfMoods;
    }
    
    public void printParentMoodList()
    {
        for(int i = 0; i < parentMoodList.size(); i++)
        {
            System.out.println(parentMoodList.get(i).getMoodDetails());
        }
        System.out.println(parentMoodList.size());
    }
    
    public boolean requestSearchMoodList(String moodToSearch)
    {
        boolean searchedMoodFound;
        int moodsFound = 0;        
        this.moodRowsFound = new ArrayList();
        moodToSearch = moodToSearch.toLowerCase();
        
        for(int i = 0; i < this.parentMoodList.size(); i++)
        {
            String moodName = this.parentMoodList.get(i).getMood().toLowerCase();
            
            if(moodName.contains(moodToSearch) || moodName.equalsIgnoreCase(moodToSearch))
            {
                moodsFound++;
                this.moodRowsFound.add(i);
            }
        }    
        
        searchedMoodFound = moodsFound > 0;
        
        return searchedMoodFound;
    }
    
    public ArrayList<Integer> getListOfMoodRowsFound()
    {
        return this.moodRowsFound;
    }
}
