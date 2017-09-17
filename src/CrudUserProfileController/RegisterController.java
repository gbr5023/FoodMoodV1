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
    
    public RegisterController() {
        view = new RegisterView();
        model = new GeneralUser();
    }
    
    public RegisterController(GeneralUser model, RegisterView view) {
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
