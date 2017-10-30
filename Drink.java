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
public class Drink 
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
        this.drinkName = drinkName;
        this.drinkWeight = drinkWeight;
        this.timeSinceLastConsumed = timeSinceLastConsumed;
        dList = new ArrayList();
    }

    public Drink getDrink(){
        return new Drink (this.drinkName, this.drinkWeight, this.timeSinceLastConsumed);
    }
    
    public void setDrink(Drink d){
        setDrinkName(d.getDrinkName());
        setDrinkWeight(d.getDrinkWeight());
        setTimeSinceLastConsumed(d.getTimeSinceLastConsumed());
    }
    /**
     * @return the drinkName
     */
    public String getDrinkName() {
        return drinkName;
    }

    /**
     * @param drinkName the drinkName to set
     */
    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    /**
     * @return the drinkWeight
     */
    public double getDrinkWeight() {
        return drinkWeight;
    }

    /**
     * @param drinkWeight the drinkWeight to set
     */
    public void setDrinkWeight(double drinkWeight) {
        this.drinkWeight = drinkWeight;
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
     * @return the timeSinceLastConsumed
     */
    public int getTimeSinceLastConsumed() {
        return timeSinceLastConsumed;
    }

    /**
     * @param timeSinceLastConsumed the timeSinceLastConsumed to set
     */
    public void setTimeSinceLastConsumed(int timeSinceLastConsumed) {
        this.timeSinceLastConsumed = timeSinceLastConsumed;
    }
    
    public void addDrink(Drink d){
        dList.add(d);
    }
    
    public void updateDrink(int index, Drink d){
        dList.get(index).setDrink(d);
    }
    public void removeDrink(int index){
        dList.remove(index);
    }
}