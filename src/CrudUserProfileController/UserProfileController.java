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
import DatabaseController.*;
import NavigationController.NavigationController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author michaelcavallaro
 */
public class UserProfileController {
    NavigationController theNavigationController;
    UserProfileView theUserProfileView;
    /**
     * Constructs an empty LoginController
     * @param  parentNavigationController the original NavigationController object
     */
    public UserProfileController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to UserProfileController.");
        this.theNavigationController = parentNavigationController;
    }
    
    public void requestUserProfileView()
    {
        theUserProfileView = new UserProfileView(this);
        theUserProfileView.setTitle("Login");
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
    
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
    
}