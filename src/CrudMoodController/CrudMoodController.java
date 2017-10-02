/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodController;

import CrudMoodView.CrudMoodView;
import DatabaseController.DatabaseController;
import NavigationController.NavigationController;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 * 
 * @author michaelcavallaro
 */
public class CrudMoodController implements DatabaseController 
{
    private CrudMoodView view;
    NavigationController theNavigationController;
    
    /**
     * Constructs a new empty CrudIntakeController
     * @param parentNavigationController This is the original NavigationController object
     */
    public CrudMoodController(NavigationController parentNavigationController)
    {
        this.theNavigationController = parentNavigationController;
        view = new CrudMoodView(this);
        view.setTitle("Input Mood");
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }
    
    /**
     * Constructs a new CrudIntakeView
     * @param view This is the CrudMoodView local object
     */
    public CrudMoodController(CrudMoodView view) {
        this.view = view;
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theNavigationController.requestNavigationView();
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
     * @return Result will be true if statement executed without error
     */
    @Override
    public ResultSet executeNonUpdateQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Execute update statement to make changes, removals, etc.
     * @param con Connection to database
     * @param sql SQL Statement string
     * @return Result will be true if statement executed without error
     */
    @Override
    public int executeQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
