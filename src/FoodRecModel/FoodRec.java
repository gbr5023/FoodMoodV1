/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodRecModel;

import java.io.Serializable;

/**
 *
 * @author Gisward
 */
public class FoodRec implements Serializable
{
    String theFoodRec;
    String theFoodRecCategory;
    
    public FoodRec(String theFoodRec, String theFoodRecCategory)
    {
        this.theFoodRec = theFoodRec;
        this.theFoodRecCategory = theFoodRecCategory;
    }
    
    public String getFoodRec()
    {
        return this.theFoodRec;
    }
    
    public String getFoodRecCategory()
    {
        return this.theFoodRecCategory;
    }
    
    public void setFoodRec(String theFoodRec)
    {
        this.theFoodRec = theFoodRec;
    }
    
    public void setFoodRecCategory(String theFoodRecCategory)
    {
        this.theFoodRecCategory = theFoodRecCategory;
    }
    
    public String getFoodRecDetails()
    {
        String foodRecDetails = this.getFoodRec()+ ": " + this.getFoodRecCategory();
        
        return foodRecDetails;
    }
}
