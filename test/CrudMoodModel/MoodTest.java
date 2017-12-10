/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodModel;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmk5180
 */
public class MoodTest {
    
    public MoodTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMood method, of class Mood.
     */
    @Test
    public void testGetMood() {
        System.out.println("getMood");
        Mood instance = new Mood("Bad", "More Bad");
        String expResult = "Bad";
        String result = instance.getMood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setMood method, of class Mood.
     */
    @Test
    public void testSetMood() {
        System.out.println("setMood");
        String mood = "Good";
        Mood instance = new Mood(mood, "More Bad");
        instance.setMood(mood);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
