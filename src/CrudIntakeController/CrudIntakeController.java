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
    
    /**
     * Constructs a new empty CrudIntakeController
     */
    public CrudIntakeController() {
        view = new CrudIntakeView();
    }
    
    /**
     * Constructs a new CrudIntakeView
     * @param view 
     */
    public CrudIntakeController(CrudIntakeView view) {
        this.view = view;
    }
    
    /**
     * New connection to a database
     * @return SQL Connection 
     */
    @Override
    public Connection newConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Execute query to read in information
     * @param con Connection to database
     * @param sql SQL Statement string
     * @return 
     */
    @Override
    public boolean executeNonUpdateQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Execute update statement to make changes, removals, etc.
     * @param con Connection to database
     * @param sql SQL Statement string
     * @return 
     */
    @Override
    public boolean executeQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
