/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeModel;

import java.util.*;

/**
 *
 * @author nja5128
 */
public class Food
{
    private String foodName;
    private double foodWeight;
    private String timeSinceLastConsumed;

    /**
     * This is the default constructor for the Food class
     * It captures user-entered name, weight, and time since last consumed. 
     * It sets it to local variables. 
     * It creates a new Food object.
     * @param foodName This is the Food's name to capture
     * @param foodWeight This is the Food's weight (in oz) to capture
     * @param timeSinceLastConsumed This is the time (in min) since Food was last consumed
     */
    public Food(String foodName, double foodWeight, String timeSinceLastConsumed) 
    {
        this.foodName = foodName;
        this.foodWeight = foodWeight;
        this.timeSinceLastConsumed = timeSinceLastConsumed;
    }
    
    public String getName()
    {
        return this.foodName;
    }
    
    public double getWeight()
    {
        return this.foodWeight;
    }

    public String getTimeSinceLastConsumed()
    {
        return this.timeSinceLastConsumed;
    }
    
    public void setName(String n)
    {
        this.foodName = n;
    }
    
    public void setWeight(double d)
    {
        this.foodWeight = d;
    }
    
    public void setTimeSinceLastConsumed(String i)
    {
        this.timeSinceLastConsumed = i;
    }
}