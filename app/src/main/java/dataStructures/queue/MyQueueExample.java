package dataStructures.queue;

import java.util.Stack;

public class MyQueueExample<T> implements MyQueue<T>
{

    private Stack<T> stack1;
    private Stack<T> stack2;

    public MyQueueExample()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Add a new element to the back of the queue
     * @param element to be added
     */
    @Override
    public void enqueue(T element)
    {
        stack1.add(element);
    }


    /**
     * Return the front element of the queue and remove it from
     * the data structure.  Throw a runtime exception if the queue is empty
     * @return the front element
     */
    @Override
    public T dequeue()
    {
        if(stack2.isEmpty())
           transferStacks();
        return stack2.pop();
    }

    private void transferStacks()
    {
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
    }

    /**
     * Take a look at the front of the queue without removing it
     * @return the first element of the queue
     */
    public T first()
    {
        if(stack2.isEmpty())
            transferStacks();
        return stack2.peek();
    }

    /**
     * @return the number of elements in the queue
     */
    public int size()
    {
        return stack1.size() + stack2.size();
    }

    /**
     * @return {@code true} if the Queue is empty
     */
    @Override
    public boolean isEmpty()
    {
        return size() == 0;
    }
}
