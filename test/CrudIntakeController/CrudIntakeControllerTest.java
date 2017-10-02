/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeController;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import CrudIntakeController.CrudIntakeController;
import NavigationController.NavigationController;

/**
 *
 * @author Nick
 */
public class CrudIntakeControllerTest {
    NavigationController n = new NavigationController();
    public CrudIntakeControllerTest() {
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
    
    @After
    public void tearDown() {
    }

  @Test
    public void testRequestControllerView() {
        System.out.println("requestIntakeView");
        CrudIntakeController controller = new CrudIntakeController(n);
        controller.requestNavigationView();
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
