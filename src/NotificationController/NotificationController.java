/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NotificationController;

import DatabaseController.DatabaseController;
import NavigationController.NavigationController;
import NotificationView.NotificationView;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class NotificationController implements DatabaseController
{
    NavigationController theNavigationController;
    
    /**
     * Constructs a new NotificationController
     * @param parentNavigationController This is the original NavigationController object
     */
    public NotificationController(NavigationController parentNavigationController)
    {
        this.theNavigationController = parentNavigationController;
        NotificationView theNotificationView = new NotificationView(this);
        theNotificationView.setTitle("Notifications");
        theNotificationView.setLocationRelativeTo(null);
        theNotificationView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theNotificationView.setVisible(true);
    }

    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theNavigationController.requestNavigationView();
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
    public ResultSet executeNonUpdateQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Executes a new update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    @Override
    public int executeQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
