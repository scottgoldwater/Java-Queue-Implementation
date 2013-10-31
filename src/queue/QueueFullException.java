package queue;

/**
 *
 * @author
 * Scott Goldwater
 */
public class QueueFullException extends Exception{
    //Is thrown when a full queue is enqueued
    public QueueFullException()
    {
        super("This Queue is full");
    }
}

