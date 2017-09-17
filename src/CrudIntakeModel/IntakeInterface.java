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
public interface IntakeInterface 
{
    public String getName();
    public void setName(String name);
    
    public double getWeight();
    public void setWeight(double weight);
    
    public int getTimeSinceLastConsumed();
    public void setTimeSinceLastConsumed(int timeSinceLastConsumed);
}
