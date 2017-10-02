/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileView;

import CrudUserProfileModel.GeneralUser;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author michaelcavallaro
 */
public class ForgotUserView extends JFrame {
    private GeneralUser model;
    private JPanel mainPanel;
    private JButton submitButton;
    private JLabel emailLabel;
    private JTextField emailField;
    
    public ForgotUserView(GeneralUser model) {
        this.model = model;
        setSize(300,300);
        setLayout(new FlowLayout());
        
        submitButton = new JButton("Submit");
        
        emailLabel = new JLabel("Email: ");
        
        emailField = new JTextField(20);
        
        mainPanel = new JPanel(new FlowLayout());
        
        mainPanel.add(emailLabel);
        mainPanel.add(emailField);
        mainPanel.add(submitButton);
        
        add(mainPanel);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JTextField getEmailField() {
        return emailField;
    }
    
    
}
