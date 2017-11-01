/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NavigationController;
import CrudIntakeController.CrudIntakeController;
import CrudMoodController.CrudMoodController;
import CrudUserProfileController.LoginController;
import CrudUserProfileController.UserProfileController;
import FoodRecController.FoodRecController;
import NotificationController.NotificationController;
import StatisticController.StatisticController;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class NavigationController 
{
    NavigationView theNavigationView;
    
    /**
     * Constructs a new NavigationController
     */
    public NavigationController()
    {
        theNavigationView = new NavigationView(this);
        theNavigationView.setTitle("FoodMood Navigation");
        theNavigationView.setLocationRelativeTo(null);
        theNavigationView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theNavigationView.setVisible(true);
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        theNavigationView.setVisible(true);
    }
    
    /**
     * Navigates user to the CrudIntakeController.
     * Creates a new CrudIntakeController
     */
    public void getCrudIntakeController()
    {
        theNavigationView.setVisible(false);
        CrudIntakeController theCrudIntakeController = new CrudIntakeController(this);
    }
    
    /**
     * Navigates user to the CrudMoodController.
     * Creates a new CrudMoodController
     */
    public void getCrudMoodController()
    {
        theNavigationView.setVisible(false);
        CrudMoodController theCrudMoodController = new CrudMoodController(this);
    }
    
    /**
     * Navigates user to the LoginController.
     * Creates a new LoginController
     */
    public void getUserProfileController()
    {
        theNavigationView.setVisible(false);
        UserProfileController theUserProfileController = new UserProfileController(this);
    }
    
    /**
     * Navigates user to the NotificationController.
     * Creates a new NotificationController
     */
    public void getNotificationController()
    {
        theNavigationView.setVisible(false);
        NotificationController theNotificationController = new NotificationController(this);
    }
    
    /**
     * Navigates user to the StatisticController.
     * Creates a new StatisticController
     */
    public void getStatisticController()
    {
        theNavigationView.setVisible(false);
        StatisticController theStatisticController = new StatisticController(this);
    }
    
    /**
     * Navigates user to the FoodRecController
     * Creates a new FoodRecController
     */
    public void getFoodRecController()
    {
        theNavigationView.setVisible(false);
        FoodRecController theFoodRecController = new FoodRecController(this);
    }
}
