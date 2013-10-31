package queue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 * Scott Goldwater 
 */
public class QueueTest {
    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("dequeue");
        Queue instance = new Queue(3);
        instance.enqueue(1);
        instance.enqueue(2);
        instance.enqueue(3);
        int expResult = 1;
        int result = instance.dequeue();
        assertEquals(expResult, result);
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() throws Exception {
        System.out.println("enqueue");
        int value = 3;
        Queue instance = new Queue(3);
        instance.enqueue(1);
        instance.enqueue(2);
        instance.enqueue(3);
        instance.dequeue();
        instance.dequeue();
        int result = instance.dequeue();
        assertEquals(value,result);
        
    }
    
    @Test(expected=InvalidQueueLengthException.class)
    public void testInvalidQueueLengthException() throws InvalidQueueLengthException{
        new Queue(-1);
    }
    
    @Test(expected=QueueFullException.class)
    public void testInvalidQueueFullException() throws Exception{
        Queue instance = new Queue(3);
        instance.enqueue(1);
        instance.enqueue(2);
        instance.enqueue(3);
        instance.enqueue(4);
        
    }
    
    @Test(expected=QueueEmptyException.class)
    public void testQueueEmptyException() throws Exception {
        Queue instance = new Queue (3);
        instance.dequeue();
        
    }
    
    
}