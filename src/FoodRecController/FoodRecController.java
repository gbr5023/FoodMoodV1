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
    
    /**
     * Constructs a new FoodRecController
     * @param parentNavigationController This is the original NavigationController object
     */
    public FoodRecController(NavigationController parentNavigationController)
    {
        this.theNavigationController = parentNavigationController;
        FoodRecView theFoodRecView = new FoodRecView(this);
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
        this.theNavigationController.requestNavigationView();
    }
}
