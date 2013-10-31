/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author
 * Scott Goldwater
 */
public interface IQueue {
    int dequeue() throws QueueEmptyException;
    void enqueue(int var) throws QueueFullException;
}
