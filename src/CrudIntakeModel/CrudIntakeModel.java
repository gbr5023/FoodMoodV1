/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeModel;

/**
 *
 * @author Nick
 */

import CrudIntakeModel.Drink;
import CrudIntakeModel.Food;
import java.util.*;

public class CrudIntakeModel 
{
    private List<Food> foodList = new ArrayList<>();
    private List<Drink> drinkList = new ArrayList<>();
    
    /**
     * This is the default constructor for CrudIntakeModel 
     */
    public CrudIntakeModel(){
        readFile();
    }
    
    /**
     * Reads the intake file
     */
    public void readFile(){
        System.out.println("Reading from file");
    }
    
    /**
     * Saves the intake to a file
     * @param o Item to save
     */
    public void saveToFile(Object o){
        System.out.println("Saving " + o.toString() + " to file");
    }
    
    /**
     * Add food to the Food ArrayList
     * @param f Food to add
     */
    public void addFood(Food f){
        getFoodList().add(f);
        saveToFile(f);
    }
    
    /**
     * Add drink to the Drink ArrayList
     * @param d Drink to add
     */
    public void addDrink(Drink d){
        getDrinkList().add(d);
        saveToFile(d);
    }

    /**
     * @return the foodList
     */
    public List<Food> getFoodList() {
        return foodList;
    }

    /**
     * @param foodList the foodList to set
     */
    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    /**
     * @return the drinkList
     */
    public List<Drink> getDrinkList() {
        return drinkList;
    }

    /**
     * @param drinkList the drinkList to set
     */
    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }
    
}