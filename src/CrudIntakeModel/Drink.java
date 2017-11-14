/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gisward
 */
public class Drink extends Item
{
    private String drinkName;
    private double drinkWeight;
    private int timeSinceLastConsumed;
    private List<Drink> dList;
    
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
        super(drinkName, drinkWeight, timeSinceLastConsumed);
        dList = new ArrayList();
    }
    
    
    /**
     * 
     * @return a Drink object
     */
    public Drink getDrink(){
        return new Drink (this.drinkName, this.drinkWeight, this.timeSinceLastConsumed);
    }
    /**
     * 
     * @param d This is the drink that is being set if the parameter is a Drink
     */
    public void setDrink(Drink d){
        setName(d.getName());
        setWeight(d.getWeight());
        setTimeSinceLastConsumed(d.getTimeSinceLastConsumed());
    }
    /**
     * This is the method to set the drink if it is given a name, a weight, and a time since last consumed
     * @param n This is the drink name
     * @param d This is the drink weight
     * @param i This is the time since last consumed
     */
    public void setDrink(String n, Double d, Integer i){
        setName(n);
        setWeight(d);
        setTimeSinceLastConsumed(i);
    }
 

    /**
     * @return the dList
     */
    public List<Drink> getdList() {
        return dList;
    }

    /**
     * @param dList the dList to set
     */
    public void setdList(List<Drink> dList) {
        this.dList = dList;
    }

    /**
     * This method adds a drink to the drink list
     * @param d This is a drink object that is being added to the drink list
     */
   
    public void addDrink(Drink d){
        dList.add(d);
    }
    
    /**
     * 
     * @param index This is where the drink will be updated from (index is from the drink list)
     * @param d This is the drink that is being updated
     */
    
    public void updateDrink(int index, Drink d){
        dList.get(index).setDrink(d);
    }
    /**
     * 
     * @param index This is the index of the drink list where the drink will be removed
     */
    public void removeDrink(int index){
        dList.remove(index);
    }
    
    
}