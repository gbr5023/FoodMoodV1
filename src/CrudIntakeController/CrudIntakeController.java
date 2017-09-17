/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeController;

import CrudIntakeView.CrudIntakeView;
import DatabaseController.DatabaseController;
import java.sql.Connection;

/**
 *
 * @author michaelcavallaro
 */
public class CrudIntakeController implements DatabaseController{
    private CrudIntakeView view;
    
    public CrudIntakeController() {
        view = new CrudIntakeView();
    }
    
    /**
     * Constucts 
     * @param view 
     */
    public CrudIntakeController(CrudIntakeView view) {
        
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
