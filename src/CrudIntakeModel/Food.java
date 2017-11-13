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
public class Food implements Intake
{
    private String foodName;
    private double foodWeight;
    private int timeSinceLastConsumed;
    private List<Food> fList;
    
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
        this.foodName = foodname;
        this.foodWeight = foodWeight;
        this.timeSinceLastConsumed = timeSinceLastConsumed;
        fList = new ArrayList();
    }
    
 
    /**
     * 
     * @return the food
     */
    
      public Food getFood(){
        return new Food(this.foodName, this.foodWeight, this.timeSinceLastConsumed);
    }
      /**
       * 
       * @param f This is the food that will be set
       */
    
    public void setFood(Food f){
        setName(f.getName());
        setWeight(f.getWeight());
        setTimeSinceLastConsumed(f.getTimeSinceLastConsumed());
    }
    
    public void setFood(String n, Double d, Integer i){
        setName(n);
        setWeight(d);
        setTimeSinceLastConsumed(i);
    }

  

    /**
     * @return the fList
     */
    public List<Food> getfList() {
        return fList;
    }

    /**
     * @param fList the fList to set
     */
    public void setfList(List<Food> fList) {
        this.fList = fList;
    }
    /**
     * 
     * @param f This food will be added
     */
    public void addFood(Food f){
        fList.add(f);
    }
    
    /**
     * 
     * @param index Where the food is in the list
     * @param f What the food is
     */
    
    public void updateFood(int index, Food f){
        fList.get(index).setFood(f);
    }
    /**
     * 
     * @param index Remove food from this index
     */
    public void removeFood(int index){
        fList.remove(index);
    }

    /**
     * @return the foodName
     */
    @Override
    public String getName() {
        return foodName;
    }
    
     /**
     * @param foodName the foodName to set
     */

    @Override
    public void setName(String name) {
        this.foodName = name;
    }

     /**
     * @return the foodWeight
     */
    @Override
    public double getWeight() {
        return foodWeight;
    }

     /**
     * @param foodWeight the foodWeight to set
     */
    @Override
    public void setWeight(double weight) {
        this.foodWeight = weight;
    }
    
     /**
     * @return the timeSinceLastConsumed
     */
    @Override
    public int getTimeSinceLastConsumed() {
        return timeSinceLastConsumed;
    }

    /**
     * @param timeSinceLastConsumed the timeSinceLastConsumed to set
     */
    @Override
    public void setTimeSinceLastConsumed(int timeSinceLastConsumed) {
        this.timeSinceLastConsumed = timeSinceLastConsumed;
    }
   
}