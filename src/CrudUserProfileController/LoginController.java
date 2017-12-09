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
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author michaelcavallaro
 */
public class LoginController {
    private User model;
    private LoginView theLoginView;
    RegisterView theRegisterView;
    NavigationController theNavigationController;
    UserList theUserList;
    
    private static String CUR_USERNAME;
    
    /**
     * Constructs an empty LoginController
     * @param  parentNavigationController the original NavigationController object
     */
    public LoginController()
    {
        System.out.println("Made it to the LoginController)");
        this.theLoginView = new LoginView(this);
        this.theLoginView.setTitle("Login");
        this.theLoginView.setLocationRelativeTo(null);
        this.theLoginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theLoginView.setVisible(true);
        this.theUserList = new UserList();
    }
    
    public static String getCurrentUser() {
        return CUR_USERNAME.toLowerCase();
    }
    
    /**
     * Constructs a new LoginController given a User Model and a LoginView
     * @param model This is the User local object
     * @param view This is the LoginView local object
     */
    public LoginController(User model, LoginView view) {
        this.model = model;
        this.theLoginView = view;
        
        
    }
    /**
     * Calls the original NavigationView GUI
     */
    public void requestLoginView()
    {
        this.theLoginView.setVisible(true);
    }
    
    public NavigationController requestNavigationController() {
        this.theLoginView.dispose();
        this.theNavigationController = new NavigationController();
        return this.theNavigationController;
    }
    
    public boolean requestAuthenticate(String emailToCheck, char[] passwordToCheck) {
        boolean auth = theUserList.authenticate(emailToCheck, passwordToCheck);

        if (auth) {
            CUR_USERNAME = emailToCheck;
        }

        return auth;
    }

    public void requestRegisterView() {
        theLoginView.setVisible(false);
        this.theRegisterView = new RegisterView(this);
    }

    public boolean registerUser(String firstName, String lastName, String email, char[] password) {
        if (theUserList.contains(email)) {
            return false;
        } else {
            Timestamp time = new Timestamp(System.currentTimeMillis());
            theUserList.add(new User(firstName, lastName, email, password, time));
            return true;
        }
    }
}