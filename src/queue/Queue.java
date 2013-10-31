package queue;

/**
 *
 * @author
 * Scott Goldwater
 */
public class Queue implements IQueue{
    //instance variables 
    int[] contents;
    int front;
    int back;
    int items; 
    
    
    public Queue(int length) throws InvalidQueueLengthException, OutOfMemoryError
    {
        if(length<=0)
            throw new InvalidQueueLengthException(length);
        contents = new int[length];
        front = 0;
        back = 0;
        items = 0;
    }
    
    @Override
    public int dequeue() throws QueueEmptyException{
        
        if(items == 0) 
            throw new QueueEmptyException();
        if(front == contents.length)
            front=0;
        int temp = contents[front];    
        front++;
        items--;
        return temp; 
    }
    
    /**
     *
     * @param value
     * @throws QueueFullException
     */
    @Override
    public void enqueue(int value) throws QueueFullException{
        if(items == contents.length)
            throw new QueueFullException();
        if(back == contents.length)
            back =0;
        contents[back] = value;
        back++;
        items++;
    }    
}
