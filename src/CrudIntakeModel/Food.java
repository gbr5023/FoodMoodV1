/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeModel;

/**
 *
 * @author hmk5180
 */
public class Food implements Intake
{
    public String foodName;
    public double foodWeight;
    public int timeSinceLastConsumed;
    
    /**
     * This is the default constructor for the Food class
     * It captures user-entered name, weight, and time since last consumed. 
     * It sets it to local variables. 
     * It creates a new Food object.
     * @param foodname This is the Food's name to capture
     * @param foodWeight This is the Food's weight (in oz) to capture
     * @param timeSinceLastConsumed This is the time (in min) since Food was last consumed
     */
    public Food(String foodname, double foodWeight, int timeSinceLastConsumed) 
    {
        
    }

    /**
     * This is the method that returns the food name
     * @return foodName This is the Food's name
     */
    @Override
    public String getName() 
    {
        return this.foodName;
    }

    /**
     * This is the method that sets user-entered food name to foodName
     * @param name This is the user entered food name
     */
    @Override
    public void setName(String name) 
    {
        
    }

    /**
     * This is the method that returns the food weight
     * @return foodWeight This is the Food's weight (in oz)
     */
    @Override
    public double getWeight() 
    {
        return this.foodWeight;
    }

    /**
     * This is the method that sets user-entered food weight to foodWeight
     * @param weight This is the user-entered food weight (in oz)
     */
    @Override
    public void setWeight(double weight) 
    {
        
    }

    /**
     * This is the method that returns the time since the food was last consumed
     * @return timeSinceLastConsumed This is the time (in sec) since Food was last consumed
     */
    @Override
    public int getTimeSinceLastConsumed() 
    {
        return this.timeSinceLastConsumed;
    }
    
    /**
     * This is the method that sets the user-entered time since food was last consumed 
     * to timeSinceLastConsumed
     * @param timeSinceLastConsumed This is the user-entered time (in sec) since food was last consumed
     */
    @Override
    public void setTimeSinceLastConsumed(int timeSinceLastConsumed) 
    {
        
    }
}