/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodRecController;

import NavigationController.NavigationController;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gisward
 */
public class FoodRecControllerTest 
{
    NavigationController theNavigationController = new NavigationController();
    
    public FoodRecControllerTest() {
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
     * Test of requestNavigationView method, of class FoodRecController.
     */
    @Test
    public void testRequestNavigationView() {
        System.out.println("requestNavigationView");
        FoodRecController instance = new FoodRecController(theNavigationController);
        this.theNavigationController = theNavigationController;
        instance.requestNavigationView();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
