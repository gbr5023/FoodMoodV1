/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodController;

import CrudMoodView.CrudMoodView;
import CrudMoodView.CrudMoodViewTest;
import NavigationController.NavigationController;
import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmk5180
 */
public class CrudMoodControllerTest {
    
    public CrudMoodControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of requestNavigationView method, of class CrudMoodController.
     */
    @Test
    public void testRequestNavigationView() {
        System.out.println("requestNavigationView");
        NavigationController theNavigationController = new NavigationController();
        theNavigationController.requestNavigationView();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
