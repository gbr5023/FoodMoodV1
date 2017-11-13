/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeModel;

/**
 *
 * @author Nick-PC
 */
public class Item {
    private String name;
    private double weight;
    private int timeSinceLastConsumed;
    
    public Item(String n, Double w, int t){
        this.name = n;
        this.weight = w;
        this.timeSinceLastConsumed = t;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
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
    
}
