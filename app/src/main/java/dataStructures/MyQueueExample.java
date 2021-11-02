package dataStructures;

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

    @Override
    public void enqueue(T element)
    {

    }

    @Override
    public T dequeue()
    {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
