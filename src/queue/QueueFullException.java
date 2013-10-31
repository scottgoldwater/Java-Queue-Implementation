/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author
 * scottyg
 */
public class QueueFullException extends Exception{
    
    public QueueFullException()
    {
        super("This Queue is full");
    }
}

