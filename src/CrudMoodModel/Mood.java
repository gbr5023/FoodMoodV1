/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hmk5180
 */
public class Mood 
{
    public String mood;
    public List<Mood> moodList;
    
    /**
     * This is the default constructor of the Mood class.
     * It captures user-entered mood. 
     * It sets it to the local variable. 
     * It creates a new Mood object.
     * It instantiates the list of Mood objects.
     * @param mood This describes the user's Mood after eating a certain item.
     */
    public Mood(String mood) {
        this.mood = mood;
        moodList = new ArrayList();
    }
    
    /**
     * This method returns a user's mood.
     * @return mood This is the string representation of the user's Mood.
     */
    public String getMood() {
        return this.mood;
    }
    
    /**
     * This is the method that sets user-entered mood to mood.
     * @param mood This is the user-entered mood.
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
    
    public List<Mood> getMoodList() {
        return moodList;
    }
    
    /**
     * This is the method that adds mood object to the moodList.
     * @param mood 
     */
    public void addMood(Mood mood) {
        moodList.add(mood);
    }
    
    /**
     * This is the method that updates the item in the list.
     * @param index This is the position of the item in the list that is selected to be updated.
     * @param mood This is the new mood that will replace the original mood.
     */
    public void updateMood(int index, String mood) {
        moodList.get(index).setMood(mood);
    }
    
    /**
     * This is the method that removes the item from the list.
     * @param index This is the position of the item in the list that is selected to be removed.
     */
    public void deleteMood(int index) {
        moodList.remove(index);
    }
}
