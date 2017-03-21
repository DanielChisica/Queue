/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Queue;
import Model.Shift;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie_000
 */
public class ShiftDispenserTest {
    
    public ShiftDispenserTest() {
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

    /**
     * Test of getQueue method, of class ShiftDispenser.
     */
    @Test
    public void testGetQueue() {
        System.out.println("getQueue");
        ShiftDispenser instance = new ShiftDispenser();
        Queue expResult = null;
        Queue result = instance.getQueue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQueue method, of class ShiftDispenser.
     */
    @Test
    public void testSetQueue() {
        System.out.println("setQueue");
        Queue queue = null;
        ShiftDispenser instance = new ShiftDispenser();
        instance.setQueue(queue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentShift method, of class ShiftDispenser.
     */
    @Test
    public void testGetCurrentShift() {
        System.out.println("getCurrentShift");
        ShiftDispenser instance = new ShiftDispenser();
        int expResult = 0;
        int result = instance.getCurrentShift();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentShift method, of class ShiftDispenser.
     */
    @Test
    public void testSetCurrentShift() {
        System.out.println("setCurrentShift");
        int currentShift = 0;
        ShiftDispenser instance = new ShiftDispenser();
        instance.setCurrentShift(currentShift);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queueUp method, of class ShiftDispenser.
     */
    @Test
    public void testQueueUp() {
        System.out.println("queueUp");
        Shift shift = new Shift("Health");
        ShiftDispenser instance = new ShiftDispenser();
        Iterator result = instance.queueUp(shift);
        
        ShiftDispenser instance2=new ShiftDispenser();
        Iterator expResult =instance2.queueUp(shift); ;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of unPack method, of class ShiftDispenser.
     */
    @Test
    public void testUnPack() {
        System.out.println("unPack");
        ShiftDispenser instance = new ShiftDispenser();
        Iterator expResult = null;
        Iterator result = instance.unPack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
