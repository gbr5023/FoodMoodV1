/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeModel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmk5180
 */
public class FoodTest {
    
    public FoodTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Food.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Food instance = new Food("test", 0.0, "30 hr");
        String expResult = null;
        //String result = instance.getName();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Food.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "name";
        Food instance = new Food("test", 0.0, "30 hr");
        //instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Food.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Food instance = new Food("test", 0.0, "30 hr");
        double expResult = 0.0;
        //double result = instance.getWeight();
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Food.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 0.0;
        Food instance = new Food("test", 0.0, "30 hr");
        //instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeSinceLastConsumed method, of class Food.
     */
    @Test
    public void testGetTimeSinceLastConsumed() {
        System.out.println("getTimeSinceLastConsumed");
        Food instance = new Food("test", 0.0, "30 hr");
        int expResult = 0;
        String result = instance.getTimeSinceLastConsumed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeSinceLastConsumed method, of class Food.
     */
    @Test
    public void testSetTimeSinceLastConsumed() {
        System.out.println("setTimeSinceLastConsumed");
        String timeSinceLastConsumed = "40 hr";
        Food instance = new Food(null, 0.0, "30 hr");
        instance.setTimeSinceLastConsumed(timeSinceLastConsumed);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
