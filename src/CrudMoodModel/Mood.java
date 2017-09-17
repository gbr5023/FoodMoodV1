/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodModel;

/**
 *
 * @author hmk5180
 */
public class Mood 
{
    public String mood;
    
    /**
     * This is the default constructor of the Mood class
     * It captures user-entered mood. 
     * It sets it to the local variable. 
     * It creates a new Mood object.
     * @param mood This describes the user's Mood after eating a certain item
     */
    public Mood(String mood) 
    {
        
    }
    
    /**
     * This method returns a user's mood
     * @return mood This is the string representation of the user's Mood
     */
    public String getMood()
    {
        return this.mood;
    }
    
    /**
     * This is the method that sets user-entered mood to mood
     * @param mood This is the user-entered mood
     */
    public void setMood(String mood)
    {
        
    }
}
