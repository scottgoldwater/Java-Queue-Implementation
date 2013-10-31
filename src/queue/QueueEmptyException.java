package queue;

/**
 *
 * @author
 * Scott Goldwater
 */
public class QueueEmptyException extends Exception{
    //Is thrown when an empty queue is dequeued 
    public QueueEmptyException()
    {
        super("This Queue is empty");
    }
}
