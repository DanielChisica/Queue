/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Jiménez Chísica
 */
public class QueueTest {
    
    public QueueTest() {
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
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Queue instance = new Queue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Empty method, of class Queue.
     */
    @Test
    public void testEmpty() {
        System.out.println("Empty");
        Queue instance = new Queue();
        instance.add(new Object());
        instance.Empty();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Queue instance = new Queue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class Queue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = new Object();
        Queue instance = new Queue();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of take method, of class Queue.
     */
    @Test
    public void testTake() {
        System.out.println("take");
        Queue instance = new Queue();
        String test="test";
        instance.add(test);
        Object expResult = new String("test");
        Object result = instance.take();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class Queue.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Queue instance = new Queue();
        instance.add(new String("test"));
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of iterator method, of class Queue.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Queue instance = new Queue();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
