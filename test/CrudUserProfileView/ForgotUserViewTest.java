/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserProfileView;

import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gisward
 */
public class ForgotUserViewTest {
    
    public ForgotUserViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getSubmitButton method, of class ForgotUserView.
     */
    @Test
    public void testGetSubmitButton() {
        System.out.println("getSubmitButton");
        ForgotUserView instance = null;
        JButton expResult = null;
        JButton result = instance.getSubmitButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailField method, of class ForgotUserView.
     */
    @Test
    public void testGetEmailField() {
        System.out.println("getEmailField");
        ForgotUserView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getEmailField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
