/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NavigationController;
import CrudIntakeController.CrudIntakeController;
import CrudMoodController.CrudMoodController;
import CrudUserProfileController.UserProfileController;
import CrudUserProfileModel.User;
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
    CrudIntakeController theCrudIntakeController;
    CrudMoodController theCrudMoodController;
    UserProfileController theUserProfileController;
    FoodRecController theFoodRecController;
    NotificationController theNotificationController;
    StatisticController theStatisticController;
    String theIntake;
    User currentUser;
    
    /**
     * Constructs a new NavigationController
     * Creates all controller classes
     */
    public NavigationController(User cur)
    {
        System.out.println("Made it to the NavigationController");
        this.theCrudIntakeController = new CrudIntakeController(cur);
        this.theCrudMoodController = new CrudMoodController(cur);
        this.theUserProfileController = new UserProfileController(cur);
        this.theFoodRecController = new FoodRecController(cur);
        this.theNotificationController = new NotificationController(cur);
        this.theStatisticController = new StatisticController(cur);
        this.theStatisticController.setParentCrudMoodController(theCrudMoodController);
        this.theIntake = "";
        currentUser = cur;
        this.requestNavigationView();
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        theNavigationView = new NavigationView(this);
        theNavigationView.setTitle("FoodMood Navigation");
        theNavigationView.setLocationRelativeTo(null);
        theNavigationView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theNavigationView.setVisible(true);
    }
    
    /**
     * Navigates user to the CrudIntakeController.
     * Holds Parent NavigationController
     */
    public void getCrudIntakeController()
    {
        this.theCrudIntakeController.setParentNavigationController(this);
    }
    
    public CrudIntakeController requestCrudIntakeController()
    {
        return this.theCrudIntakeController;
    }
    
    /**
     * Navigates user to the CrudMoodController.
     * Holds Parent NavigationController
     */
    public void getCrudMoodController()
    {
        this.theCrudMoodController.requestCrudMoodView(theIntake);
    }
    
    public void setCrudMoodController(CrudMoodController parentCrudMoodController)
    {
        this.theCrudMoodController = parentCrudMoodController;
    }
    
    public CrudMoodController requestCrudMoodController()
    {
        return this.theCrudMoodController;
    }
    
    /**
     * Navigates user to the UserLoginController.
     * Holds Parent NavigationController
     */
    public void getUserProfileController()
    {
        this.theUserProfileController.setParentNavigationController(this);
    }
    
    /**
     * Navigates user to the NotificationController.
     * Holds Parent NavigationController
     */
    public void getNotificationController()
    {
        this.theNotificationController.setParentNavigationController(this);
    }
    
    /**
     * Navigates user to the StatisticController.
     * Holds Parent NavigationController
     */
    public void getStatisticController()
    {
        this.theStatisticController.setTableModels(this.requestCrudIntakeController().getFoodListTableModel(), 
                this.requestCrudIntakeController().getDrinkListTableModel(), 
                this.requestCrudMoodController().getMoodListTableModel());
        this.theStatisticController.setParentCrudMoodController(this.theCrudMoodController);
        this.theStatisticController.setParentNavigationController(this);
    }
    
    /**
     * Navigates user to the FoodRecController
     * Holds Parent NavigationController
     */
    public void getFoodRecController()
    {
        this.theFoodRecController.setParentNavigationController(this);
    }
}
