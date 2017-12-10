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
    
    public static String STORAGE_FILE_PATH = "data/" + LoginController.getCurrentUser() +"-mood.ser";

    public MoodList() 
    {
        this.parentMoodList = SerializedDataCntl.getSerializedDataCntl().getMoodList();
        if (this.parentMoodList.isEmpty()) 
        {
            readMoodFile();
        }
    }
    
    public void readMoodFile() 
    {
        this.parentMoodList = new ArrayList<>();
        
        try
        {
            this.moodFileURL = getClass().getResource("Mood.csv");
            this.moodFile = new File(this.moodFileURL.getPath());
            
            boolean cont = true;
            in = new Scanner(this.moodFile);

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String temp = in.nextLine();
                    String[] newM = temp.split(COMMA_DELIMITER);
                    
                    if (newM.length > 0) {
                        this.newMood = new Mood(newM[0]);
                        this.parentMoodList.add(this.newMood);
                    }
                }
                else
                {
                    cont = false;
                    System.out.println("Reading mood file done.");
                }   
            }
            SerializedDataCntl.getSerializedDataCntl().setList(this.parentMoodList, STORAGE_FILE_PATH);
            //printParentMoodList();
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
    
    public ArrayList<Mood> getParentMoodList()
    {
        if(this.parentMoodList == null)
        {
            this.readMoodFile();
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
