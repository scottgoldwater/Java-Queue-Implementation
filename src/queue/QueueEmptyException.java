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
public class QueueEmptyException extends Exception{
    
    public QueueEmptyException()
    {
        super("This Queue is empty");
    }
}