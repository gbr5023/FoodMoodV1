/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodRecController;

import FoodRecView.FoodRecView;
import NavigationController.NavigationController;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class FoodRecController 
{
    NavigationController theNavigationController;
    FoodRecView theFoodRecView;
    
    /**
     * Constructs a new FoodRecController
     * @param parentNavigationController This is the original NavigationController object
     */
    public FoodRecController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to FoodRecController.");
        this.theNavigationController = parentNavigationController;
    }
    
    public void requestFoodRecView()
    {
        theFoodRecView = new FoodRecView(this);
        theFoodRecView.setTitle("Food Recommendations");
        theFoodRecView.setLocationRelativeTo(null);
        theFoodRecView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFoodRecView.setVisible(true);
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theFoodRecView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
    
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
}
