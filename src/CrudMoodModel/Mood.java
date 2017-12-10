/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodModel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hmk5180
 */
public class Mood implements Serializable
{
    String mood;
    String moodIntake;
    
    /**
     * This is the default constructor of the Mood class.
     * It captures user-entered mood. 
     * It sets it to the local variable. 
     * It creates a new Mood object.
     * It instantiates the list of Mood objects.
     * @param mood This describes the user's Mood after eating a certain item.
     */
    public Mood(String mood, String moodIntake) 
    {
        this.mood = mood;
        this.moodIntake = moodIntake;
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
    
    public String getMoodIntake()
    {
        return this.moodIntake;
    }
    
    public void setMoodIntake(String moodIntake)
    {
        this.moodIntake = moodIntake;
    }
    
    public String getMoodDetails()
    {
        String moodDetails = "Mood: " + this.getMood() + " from " + this.moodIntake;
        
        return moodDetails;
    }
}
