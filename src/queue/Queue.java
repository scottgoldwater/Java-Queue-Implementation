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
    int front;
    int back;
    int items; 
    
    
    public Queue(int length) throws InvalidQueueLengthException
    {
        if(length<=0)
            throw new InvalidQueueLengthException(length);
        contents = new int[length];
        front = 0;
        back = 0;
        items = 0;
    }
    
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
