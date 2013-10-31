package queue;

/**
 *
 * @author
 * Scott Goldwater 
 */
public class InvalidQueueLengthException extends Exception{
    //Is thrown when a negative length is inputted into the queue
    InvalidQueueLengthException(int length) {
        super("You cannot use length" + length + ". Please use a postivle length 1 and over");
    }
    
}
