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
public class InvalidQueueLengthException extends Exception{

    InvalidQueueLengthException(int length) {
        super("You cannot use length" + length + ". Please use a postivle length 1 and over");
    }
    
}
