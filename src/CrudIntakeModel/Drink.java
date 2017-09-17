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
public class Drink implements IntakeInterface
{
    public String drinkName;
    public double drinkWeight;
    public int timeSinceLastConsumed;
    
    /**
     * This is the default constructor for the Drink class
     * It captures user-entered name, weight, and time since last consumed. 
     * It sets it to local variables. 
     * It creates a new Drink object.
     * @param drinkName This is the Drink's name
     * @param drinkWeight This is the Drink's weight (in oz)
     * @param timeSinceLastConsumed This is the time (in min) since drink was last consumed
     */
    public Drink(String drinkName, double drinkWeight, int timeSinceLastConsumed)
    {
        
    }

    /**
     * This is the method that returns the drink name
     * @return drinkName This is the Drink's name
     */
    @Override
    public String getName() 
    {
        return this.drinkName;
    }

    /**
     * This is the method that sets user-entered drink name to drinkName
     * @param name This is the user entered drink name
     */
    @Override
    public void setName(String name) 
    {
        
    }

    /**
     * This is the method that returns the drink weight
     * @return drinkWeight This is the Drink's weight
     */
    @Override
    public double getWeight() 
    {
        return this.drinkWeight;
    }

    /**
     * This is the method that sets user-entered drink weight to drinkWeight
     * @param weight This is the user-entered drink weight (in oz)
     */
    @Override
    public void setWeight(double weight) 
    {
        
    }

    /**
     * This is the method that returns the time since drink was last consumed
     * @return timeSinceLastConsumed This is the time (in sec) since Drink was last consumed
     */
    @Override
    public int getTimeSinceLastConsumed() 
    {
        return this.timeSinceLastConsumed;
    }

    /**
     * This is the method that sets user-entered time since drink was last consumed 
     * to timeSinceLastConsumed
     * @param timeSinceLastConsumed This is the user-entered time (in sec) since drink was last consumed
     */
    @Override
    public void setTimeSinceLastConsumed(int timeSinceLastConsumed) 
    {
        
    }
}