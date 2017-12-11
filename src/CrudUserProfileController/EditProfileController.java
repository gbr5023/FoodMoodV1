/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;

import CrudIntakeView.CrudIntakeView;
import CrudMoodView.CrudMoodView;
import CrudUserProfileModel.*;
import CrudUserProfileView.*;
import NavigationController.NavigationController;
import javax.swing.JFrame;

/**
 *
 * @author michaelcavallaro
 */
public class EditProfileController {
    private UserProfileController theUserProfileController;
    private EditProfileView editProfileView;
    private User currentUser;
    private UserList currentUserList;
    
    /**
     * Creates UserProfileController
     * @param currentUser
     */
    public EditProfileController(UserProfileController theUserProfileController)
    {
        this.theUserProfileController = theUserProfileController;
        this.currentUser = theUserProfileController.getCurrentUser();
        this.currentUserList = theUserProfileController.getCurrentUserList();
        System.out.println("EditProfileController instantiated.");
    }
    
    /**
     * Returns parent UserProfileController class
     * @return theUserProfileController
     */
    public UserProfileController getParentUserProfileController() 
    {
        return this.theUserProfileController;
    }
    
    /**
     * Sets parent NavigationController, requests UserProfileView
     * @param parentNavigationController 
     */
    public void setParentNavigationController(UserProfileController parentUserProfileController)
    {
        System.out.println("Made it to UserProfileController");
        this.theUserProfileController = parentUserProfileController;
        this.requestUserProfileView();
    }
    
    /**
     * Creates EditProfileView
     */
    public void requestEditProfileView()
    {
        editProfileView = new EditProfileView(this);
        editProfileView.setTitle("User Profile");
        editProfileView.setLocationRelativeTo(null);
        editProfileView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editProfileView.setVisible(true);
    }
    
    /**
     * Calls the original UserProfile GUI
     */
    public void requestUserProfileView()
    {
        this.editProfileView.setVisible(false);
        this.theUserProfileController.requestUserProfileView();
    } 
    
    public User getCurrentUser() {
        return currentUser;
    }
    
    public UserList getCurrentUserList() {
        return currentUserList;
    }
}