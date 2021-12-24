package dataStructures.queue;

import java.util.Stack;

public class MyQueueImp<T> implements MyQueue<T>
{

    private Stack<T> stack1;
    private Stack<T> stack2;

    /**
     * A two stack implementation of a First In Last Out queue
     */
    public MyQueueImp()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Adds a new element to the back of the queue
     * @param element
     */
    @Override
    public void enqueue(T element)
    {

    }

    /**
     * Removes an element from the front of the queue
     * @return
     */
    @Override
    public T dequeue()
    {
        return null;
    }

    /**
     * Using two stacks, figure out when each stack must be used
     */
    private void transferStacks()
    {

    }

    /**
     * @return true if both stacks are empty
     */
    @Override
    public boolean isEmpty()
    {
        return false;
    }
}
