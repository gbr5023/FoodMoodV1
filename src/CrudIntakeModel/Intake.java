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
public interface Intake 
{
    /**
     * This is the method that returns the intake name
     * @return name This is the intake name
     */
    public String getName();
    
    /**
     * This is the method that sets the user-entered intake name to the local variable
     * @param name This is the user-entered intake name
     */
    public void setName(String name);
    
    /**
     * This is the method that returns the intake weight (in oz)
     * @return weight This is the intake weight (in oz)
     */
    public double getWeight();
    
    /**
     * This is the method that sets the user-entered intake weight (in oz) to the local variable
     * @param weight This is the user-entered intake weight (in oz)
     */
    public void setWeight(double weight);
    
    /**
     * This is the method that returns the time (in sec) since intake was last consumed
     * @return timeSinceLastConsumed This is the time (in sec) since intake was last consumed
     */
    public int getTimeSinceLastConsumed();
    
    /**
     * This is the method that sets the user-entered time (in sec) since intake was last consumed
     * @param timeSinceLastConsumed This is the user-entered time (in sec) since intake was last consumed
     */
    public void setTimeSinceLastConsumed(int timeSinceLastConsumed);
}
