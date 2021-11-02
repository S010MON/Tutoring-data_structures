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
        stack1.add(element);
    }

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

    @Override
    public boolean isEmpty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
