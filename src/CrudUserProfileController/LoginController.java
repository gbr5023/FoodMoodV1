/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;
import CrudUserProfileModel.*;
import CrudUserProfileView.*;
import DatabaseController.*;
import NavigationController.NavigationController;
import java.sql.Connection;

/**
 *
 * @author michaelcavallaro
 */
public class LoginController implements DatabaseController {
    private GeneralUser model;
    private LoginView view;
    NavigationController theNavigationController;
    
    /**
     * Constructs an empty LoginController
     * @param  parentNavigationController the original NavigationController object
     */
    public LoginController(NavigationController parentNavigationController)
    {
        this.theNavigationController = parentNavigationController;
        model = new GeneralUser();
        view = new LoginView();
    }
    
    /**
     * Constructs a new LoginController given a User Model and a LoginView
     * @param model This is the GeneralUser local object
     * @param view This is the LoginView local object
     */
    public LoginController(GeneralUser model, LoginView view) {
        this.model = model;
        this.view = view;
    }
    
    /**
     * Returns a new connection to the system's database
     * @return The connection to be used
     */
    @Override
    public Connection newConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Executes a new non-update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    @Override
    public boolean executeNonUpdateQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Executes a new update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    @Override
    public boolean executeQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
