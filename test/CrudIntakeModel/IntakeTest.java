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
public class IntakeTest {
    
    public IntakeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Intake.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Intake instance = new IntakeImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Intake.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Intake instance = new IntakeImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Intake.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Intake instance = new IntakeImpl();
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Intake.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 0.0;
        Intake instance = new IntakeImpl();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeSinceLastConsumed method, of class Intake.
     */
    @Test
    public void testGetTimeSinceLastConsumed() {
        System.out.println("getTimeSinceLastConsumed");
        Intake instance = new IntakeImpl();
        int expResult = 0;
        int result = instance.getTimeSinceLastConsumed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeSinceLastConsumed method, of class Intake.
     */
    @Test
    public void testSetTimeSinceLastConsumed() {
        System.out.println("setTimeSinceLastConsumed");
        int timeSinceLastConsumed = 0;
        Intake instance = new IntakeImpl();
        instance.setTimeSinceLastConsumed(timeSinceLastConsumed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class IntakeImpl implements Intake {

        public String getName() {
            return "";
        }

        public void setName(String name) {
        }

        public double getWeight() {
            return 0.0;
        }

        public void setWeight(double weight) {
        }

        public int getTimeSinceLastConsumed() {
            return 0;
        }

        public void setTimeSinceLastConsumed(int timeSinceLastConsumed) {
        }
    }
    
}
