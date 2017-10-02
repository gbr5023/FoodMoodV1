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
public class DrinkTest {
    
    public DrinkTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Drink.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Drink instance = new Drink(null, 0.0, 30);
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Drink.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "name";
        Drink instance = new Drink("Drink", 0.0, 30);
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Drink.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Drink instance = new Drink("Drink", 0.0, 30);
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Drink.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 1.0;
        Drink instance = new Drink("Drink", 0.0, 30);
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeSinceLastConsumed method, of class Drink.
     */
    @Test
    public void testGetTimeSinceLastConsumed() {
        System.out.println("getTimeSinceLastConsumed");
        Drink instance = new Drink("Drink", 0.0, 0);
        int expResult = 0;
        int result = instance.getTimeSinceLastConsumed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeSinceLastConsumed method, of class Drink.
     */
    @Test
    public void testSetTimeSinceLastConsumed() {
        System.out.println("setTimeSinceLastConsumed");
        int timeSinceLastConsumed = 40;
        Drink instance = new Drink("Drink", 0.0, 30);
        instance.setTimeSinceLastConsumed(timeSinceLastConsumed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
