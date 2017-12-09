/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatisticController;

import DatabaseController.DatabaseController;
import NavigationController.NavigationController;
import NotificationView.NotificationView;
import StatisticView.StatisticView;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class StatisticController
{
    NavigationController theNavigationController;
    StatisticView theStatisticView;
    
    /**
     * Constructs a new StatisticController
     * @param parentNavigationController This is the original NavigationController object
     */
    public StatisticController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to StatisticController.");
        this.theNavigationController = parentNavigationController;
    }
    
    public void requestStatisticView()
    {
        theStatisticView = new StatisticView(this, this.theNavigationController);
        theStatisticView.setTitle("Statistics");
        theStatisticView.setLocationRelativeTo(null);
        theStatisticView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theStatisticView.setVisible(true);
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theStatisticView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
    
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
}
