/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import CrudIntakeController.CrudIntakeController;
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
    private String timeSinceLastConsumed;
    private List<Drink> dList;
    //CrudIntakeController theCrudIntakeController = new CrudIntakeController();
    
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
    
    @Override
    public String getName()
    {
        return this.drinkName;
    }
    
    @Override
    public double getWeight()
    {
        return this.drinkWeight;
    }
    
    @Override
    public String getTimeSinceLastConsumed()
    {
        return this.timeSinceLastConsumed;
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
    public void setDrink(String n, double d, String i){
        setName(n);
        setWeight(d);
        setTimeSinceLastConsumed(i);
    }
    
    @Override
    public void setName(String n)
    {
        this.drinkName = n;
    }
    
    @Override
    public void setWeight(double d)
    {
        this.drinkWeight = d;
    }
    
    @Override
    public void setTimeSinceLastConsumed(String i)
    {
        this.timeSinceLastConsumed = i;
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
    
     public void prettyPrint(Drink d){
        System.out.println(d.drinkName + " " + d.drinkWeight + " " + d.timeSinceLastConsumed);
    }
    public void prettyPrintList(List<Drink> dList){
        int i = 0;
        while (i < dList.size()){
            System.out.println(dList.get(i).drinkName + " " + dList.get(i).drinkWeight + " " + dList.get(i).timeSinceLastConsumed);
            i++;
        }
    }
    
    
}