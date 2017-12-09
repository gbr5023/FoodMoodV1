/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

/**
 *
 * @author Gisward
 */
public class Drink
{
    private String drinkName;
    private double drinkWeight;
    private String timeSinceLastConsumed;
    
    /**
     * This is the default constructor for the Drink class
     * It captures user-entered name, weight, and time since last consumed. 
     * It sets it to local variables. 
     * It creates a new Drink object.
     * @param drinkName This is the Drink's name
     * @param drinkWeight This is the Drink's weight (in oz)
     * @param timeSinceLastConsumed This is the time (in min) since drink was last consumed
     */
    public Drink(String drinkName, double drinkWeight, String timeSinceLastConsumed)
    {
        this.drinkName = drinkName;
        this.drinkWeight = drinkWeight;
        this.timeSinceLastConsumed = timeSinceLastConsumed;
    }
    
    public String getName()
    {
        return this.drinkName;
    }
    
    public double getWeight()
    {
        return this.drinkWeight;
    }
    
    public String getTimeSinceLastConsumed()
    {
        return this.timeSinceLastConsumed;
    }
    
    public void setName(String n)
    {
        this.drinkName = n;
    }
    
    public void setWeight(double d)
    {
        this.drinkWeight = d;
    }
    
    public void setTimeSinceLastConsumed(String i)
    {
        this.timeSinceLastConsumed = i;
    }
}