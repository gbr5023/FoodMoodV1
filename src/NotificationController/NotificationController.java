/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NotificationController;

import DatabaseController.DatabaseController;
import NavigationController.NavigationController;
import NotificationView.NotificationView;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class NotificationController
{
    NavigationController theNavigationController;
    NotificationView theNotificationView;
    
    /**
     * Constructs a new NotificationController
     * @param parentNavigationController This is the original NavigationController object
     */
    public NotificationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to NotificationController.");
        this.theNavigationController = parentNavigationController;   
    }
    
    public void requestNotificationView()
    {
        this.theNotificationView = new NotificationView(this);
        this.theNotificationView.setTitle("Notifications");
        this.theNotificationView.setLocationRelativeTo(null);
        this.theNotificationView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theNotificationView.setVisible(true);
    }

    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theNotificationView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
    
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
}
