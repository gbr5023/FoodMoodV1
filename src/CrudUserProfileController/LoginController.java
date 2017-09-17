/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;
import CrudUserProfileModel.*;
import CrudUserProfileView.*;
import DatabaseController.*;
import java.sql.Connection;

/**
 *
 * @author michaelcavallaro
 */
public class LoginController implements DatabaseController {
    private GeneralUser model;
    private LoginView view;
    
    /**
     * Constructs an empty LoginController
     */
    public LoginController() {
        model = new GeneralUser();
        view = new LoginView();
    }
    
    /**
     * Constructs a new LoginController given a User Model and a LoginView
     * @param model
     * @param view 
     */
    public LoginController(GeneralUser model, LoginView view) {
        this.model = model;
        this.view = view;
    }
    
    @Override
    public Connection newConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executeNonUpdateQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executeQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
