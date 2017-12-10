/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NotificationController;

import CrudUserProfileModel.User;
import NavigationController.NavigationController;
import NotificationView.NotificationView;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class NotificationController
{
    NavigationController theNavigationController;
    NotificationView theNotificationView;
    User currentUser;
    /**
     * Constructs a new NotificationController
     * @param currentUser
     */
    public NotificationController(User currentUser)
    {
        this.currentUser = currentUser;
        System.out.println("NotificationController instantiated.");
    }
    
    /**
     * Returns parent NavigationController class
     * @return theNavigationController
     */
    public NavigationController getParentNavigationController() {
        return this.theNavigationController;
    }
    
    /**
     * Sets parent NavigationController, requests NotificationView
     * @param parentNavigationController 
     */
    public void setParentNavigationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to NotificationController.");
        this.theNavigationController = parentNavigationController;
        this.requestNotificationView();
    }
    
    /**
     * Creates NotificationView
     */
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
}
