/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;

import CrudUserProfileModel.GeneralUser;
import CrudUserProfileView.RegisterView;
import DatabaseController.DatabaseController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michaelcavallaro
 */
public class RegisterController implements DatabaseController {
    private RegisterView view;
    private GeneralUser model;
    /**
     * This method is the default constructor method with no parameters
     */
    public RegisterController() {
        view = new RegisterView();
        model = new GeneralUser();
    }
    /**
     * This method is the constructor method with a given userModel and userView
     * @param model the user model
     * @param view  the registerUser view
     */
    public RegisterController(GeneralUser model, RegisterView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Returns a new connection to the system's database
     * @return The connection to be used
     */
    @Override
    public Connection newConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:derby:localhost:1527/foodmooddb");
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Executes a new non-update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    @Override
    public ResultSet executeNonUpdateQuery(Connection con, String sql) {
        return null;
    }

    /**
     * Executes a new update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    @Override
    public int executeQuery(Connection con, String sql) {
        return 0;
    }
    
}
