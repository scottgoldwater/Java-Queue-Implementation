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
public class Queue implements IQueue{

    int[] contents;
    int pointer; 
    
    
    public Queue(int length) throws InvalidQueueLengthException
    {
        if(length<=0)
            throw new InvalidQueueLengthException(length);
        contents = new int[length];
        pointer = 0; 
    }
    
    public int dequeue() throws QueueEmptyException{
        
        if(pointer<0) 
            throw new QueueEmptyException();
        pointer--;
        return contents[pointer+1];    
    }

    public void enqueue(int value) throws QueueFullException{
        if(pointer == contents.length)
            throw new QueueFullException();
        contents[pointer] = value;
        pointer++;
    }    
}
