/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileView;

import CrudUserProfileModel.GeneralUser;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author michaelcavallaro
 */
public class LoginView extends JFrame {
    
    private GeneralUser model;
    private JPanel mainPanel;
    private JButton loginButton, forgotButton;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField, passwordField;
    
    public LoginView(GeneralUser model) {
        this.model = model;
        setSize(300,300);
        setLayout(new FlowLayout());
        
        loginButton = new JButton("Login");
        forgotButton = new JButton("Forgot Password");
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        usernameField = new JTextField(20);
        passwordField = new JTextField(20);
        
        mainPanel = new JPanel(new FlowLayout());
        
        mainPanel.add(loginButton);
        mainPanel.add(forgotButton);
        mainPanel.add(usernameLabel);
        mainPanel.add(passwordLabel);
        mainPanel.add(usernameField);
        mainPanel.add(passwordField);
        
        add(mainPanel);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getForgotButton() {
        return forgotButton;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JTextField getPasswordField() {
        return passwordField;
    }
    
    
    
}
