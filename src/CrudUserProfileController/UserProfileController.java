/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;
import CrudUserProfileModel.*;
import CrudUserProfileView.*;
import NavigationController.NavigationController;
import javax.swing.JFrame;

/**
 *
 * @author michaelcavallaro
 */
public class UserProfileController {
    NavigationController theNavigationController;
    UserProfileView theUserProfileView;
    User currentUser;
    UserList currentUserList;
    
    /**
     * Creates UserProfileController
     * @param currentUser (User)
     * @param currentUserList (UserList)
     */
    public UserProfileController(User currentUser, UserList currentUserList)
    {
        this.currentUser = currentUser;
        this.currentUserList = currentUserList;
        System.out.println("UserProfileController instantiated.");
    }
    
    /**
     * Returns parent NavigationController class
     * @return theNavigationController (NavigationController)
     */
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
    
    /**
     * Sets parent NavigationController, requests UserProfileView
     * @param parentNavigationController (NavigationController)
     */
    public void setParentNavigationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to UserProfileController");
        this.theNavigationController = parentNavigationController;
        this.requestUserProfileView();
    }
    
    /**
     * Creates UserProfileView
     */
    public void requestUserProfileView()
    {
        theUserProfileView = new UserProfileView(this);
        theUserProfileView.setTitle("User Profile");
        theUserProfileView.setLocationRelativeTo(null);
        theUserProfileView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theUserProfileView.setVisible(true);
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theUserProfileView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
    
    /**
     * Returns current User
     * @return User
     */
    public User getCurrentUser() {
        return currentUser;
    }
    
    /**
     * Returns current UserList
     * @return UserList
     */
    public UserList getCurrentUserList() {
        return currentUserList;
    }
    
}