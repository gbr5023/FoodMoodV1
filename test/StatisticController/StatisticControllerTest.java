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
        StatisticController instance = new StatisticController(theNavigationController);
        instance.requestNavigationView();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of newConnection method, of class StatisticController.
     */
    @Test
    public void testNewConnection() {
        System.out.println("newConnection");
        StatisticController instance = null;
        Connection expResult = null;
        Connection result = instance.newConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of executeNonUpdateQuery method, of class StatisticController.
     */
    @Test
    public void testExecuteNonUpdateQuery() {
        System.out.println("executeNonUpdateQuery");
        Connection con = null;
        String sql = "";
        StatisticController instance = null;
        ResultSet expResult = null;
        ResultSet result = instance.executeNonUpdateQuery(con, sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of executeQuery method, of class StatisticController.
     */
    @Test
    public void testExecuteQuery() {
        System.out.println("executeQuery");
        Connection con = null;
        String sql = "";
        StatisticController instance = null;
        int expResult = 0;
        int result = instance.executeQuery(con, sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
