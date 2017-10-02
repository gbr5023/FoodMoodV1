/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;
import CrudIntakeView.CrudIntakeView;
import CrudUserProfileModel.*;
import CrudUserProfileView.*;
import DatabaseController.*;
import NavigationController.NavigationController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        
    }
    
    /**
     * Constructs a new LoginController given a User Model and a LoginView
     * @param model This is the GeneralUser local object
     * @param view This is the LoginView local object
     */
    public LoginController(GeneralUser model, LoginView view) {
        this.model = model;
        this.view = view;
        
        view.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(authenticateUser()) {
                    CrudIntakeView crudView = new CrudIntakeView();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                }
                   
            }
        });
        
        view.getForgotButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ForgotUserView forgotView = new ForgotUserView(model);
                ForgotUserController forgotController = new ForgotUserController(forgotView);
            }
        });
    }
    
    private boolean authenticateUser() {
        Connection con = newConnection();
        String sql = "SELECT * FROM USER WHERE USERNAME='"+view.getUsernameField().getText()+"' AND PASSWORD='"+view.getUsernameField().getText()+"'";
                
        ResultSet rs = executeNonUpdateQuery(con,sql);
        try {
            if(!rs.first())
                return false;
            else
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
        Statement st;
        ResultSet rs = null;
        try {
            st= con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
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
