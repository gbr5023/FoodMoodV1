/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileController;

import CrudUserProfileModel.User;
import CrudUserProfileView.LoginView;
import CrudUserProfileView.*;
import DatabaseController.DatabaseController;
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
public class ForgotUserController implements DatabaseController {
    private User model;
    private ForgotUserView view;
    
    /**
     * Constructs an empty ForgotUser Controller
     */
    public ForgotUserController() {
        model = new User();
        view = new ForgotUserView(model);
    }
    
    /**
     * Constructs a ForgotUserController given a User Model and a View
     * @param view  ForgotUserView 
     */
    public ForgotUserController(ForgotUserView view) {
        this.view = view;
        
        view.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(findUser()) {
                    //notify
                } else {
                    JOptionPane.showMessageDialog(null, "Could not find user");
                }
            
            }
        });
    }

    private boolean findUser() {
        Connection con = newConnection();
        String sql ="SELECT * FROM USER WHERE EMAIL='"+view.getEmailField().getText()+"'";
        
        try {
            ResultSet rs = executeNonUpdateQuery(con,sql);
            if(rs.first()) {
                JOptionPane.showMessageDialog(view, "Username:"+rs.getString("USERNAME")+"\nPassword: "+rs.getString("PASSWORD"));
                return true; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotUserController.class.getName()).log(Level.SEVERE, null, ex);
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
