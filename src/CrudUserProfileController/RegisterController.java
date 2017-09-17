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
