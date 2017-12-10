/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatisticController;

import NavigationController.NavigationController;
import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gisward
 */
public class StatisticControllerTest {
    
    NavigationController theNavigationController = new NavigationController();
    
    public StatisticControllerTest() {
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
     * Test of requestNavigationView method, of class StatisticController.
     */
    @Test
    public void testRequestNavigationView() {
        System.out.println("requestNavigationView");
        StatisticController instance = new StatisticController();
        instance.requestNavigationView();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
