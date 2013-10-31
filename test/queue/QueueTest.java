/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 * scottyg
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
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("dequeue");
        Queue instance = null;
        int expResult = 0;
        int result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() throws Exception {
        System.out.println("enqueue");
        int value = 0;
        Queue instance = null;
        instance.enqueue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}