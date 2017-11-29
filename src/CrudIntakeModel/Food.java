/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeModel;

import java.util.*;
import CrudIntakeController.CrudIntakeController;

/**
 *
 * @author nja5128
 */
public class Food extends Item 
{
    private String foodName;
    private double foodWeight;
    private int timeSinceLastConsumed;
    private List<Food> fList = new ArrayList();
    //CrudIntakeController theCrudIntakeController = new CrudIntakeController();

    /**
     * This is the default constructor for the Food class
     * It captures user-entered name, weight, and time since last consumed. 
     * It sets it to local variables. 
     * It creates a new Food object.
     * @param foodName This is the Food's name to capture
     * @param foodWeight This is the Food's weight (in oz) to capture
     * @param timeSinceLastConsumed This is the time (in min) since Food was last consumed
     */
    public Food(String foodName, double foodWeight, int timeSinceLastConsumed) 
    {
        super(foodName, foodWeight, timeSinceLastConsumed);
        //fList = new ArrayList();
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
    /**
     * This is the method to set the food if it is given a name, a weight, and a time since last consumed
     * @param n This is the food name
     * @param d This is the food weight
     * @param i This is the time since last consumed
     */
    
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
    
    public void deleteFood(int index){
        fList.remove(index);
    }
    public void prettyPrint(Food f){
        System.out.println(f.foodName + " " + f.foodWeight + " " + f.timeSinceLastConsumed);
    }
    public void prettyPrintList(List<Food> fList){
        int i = 0;
        while (i < fList.size()){
            System.out.println(fList.get(i).foodName + " " + fList.get(i).foodWeight + " " + fList.get(i).timeSinceLastConsumed);
            i++;
        }
    }
}