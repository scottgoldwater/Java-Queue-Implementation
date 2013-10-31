package queue;

/**
 *
 * @author
 * Scott Goldwater 
 */
public interface IQueue {
    //Removes an integer from the queue
    int dequeue() throws QueueEmptyException;
    //Adds and integer from the queue
    void enqueue(int var) throws QueueFullException;
}
