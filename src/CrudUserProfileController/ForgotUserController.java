/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;

import CrudUserProfileModel.GeneralUser;
import CrudUserProfileView.LoginView;
import CrudUserProfileView.*;
import DatabaseController.DatabaseController;
import java.sql.Connection;

/**
 *
 * @author michaelcavallaro
 */
public class ForgotUserController implements DatabaseController {
    private GeneralUser model;
    private ForgotUserView view;
    
    /**
     * Constructs an empty ForgotUser Controller
     */
    public ForgotUserController() {
        model = new GeneralUser();
        view = new ForgotUserView();
    }
    
    /**
     * Constructs a ForgotUserController given a User Model and a View
     * @param model User Model
     * @param view  ForgotUserView 
     */
    public ForgotUserController(GeneralUser model, ForgotUserView view) {
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
