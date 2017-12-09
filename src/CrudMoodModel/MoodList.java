/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudMoodModel;

import Serializable.SerializedDataCntl;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class MoodList 
{
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "mood.ser";
    
    private ArrayList<Mood> theListOfMoods;

    public MoodList() {
        theListOfMoods = SerializedDataCntl.getSerializedDataCntl().getMoodList();
        if (this.theListOfMoods.isEmpty()) {
            buildTestMoodList();
        }
    }
    
    public ArrayList<Mood> getListOfMoods() {
        if (this.theListOfMoods == null) {
            buildTestMoodList();
        }
        return this.theListOfMoods;
    }


    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfMoods, STORAGE_FILE_PATH);
    }

    public void setListOfMoods(ArrayList<Mood> theMoodList) {
        theListOfMoods = theMoodList;
    }

    public void buildTestMoodList() {
        this.theListOfMoods = new ArrayList();

        // Not using add() method in order to save time saving
        theListOfMoods.add(new Mood("sleepy"));
        theListOfMoods.add(new Mood("hyper"));
        theListOfMoods.add(new Mood("exhausted"));
        theListOfMoods.add(new Mood("happy"));
        theListOfMoods.add(new Mood("sad"));

        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfMoods.size(); i++) {
            System.out.println(this.theListOfMoods.get(i).getMood());
        }

        save();
    }

    public void add(Mood theMoodToAdd) {
        theListOfMoods.add(theMoodToAdd);
        save();
    }

    /* just copied from UserList class, but use the same logic to search for moods */
    public int searchMood(String moodToSearch) {
        for (int i = 0; i < this.theListOfMoods.size(); i++) {
            if (this.theListOfMoods.get(i).getMood().toLowerCase().contains(moodToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public void delete(Mood theMoodToDelete) {
        boolean removed = theListOfMoods.remove(theMoodToDelete);
        System.out.println("REMOVED : " + removed);
        save();
    }

    public Mood get(int theMoodID) {
        return theListOfMoods.get(theMoodID);
    }
}
