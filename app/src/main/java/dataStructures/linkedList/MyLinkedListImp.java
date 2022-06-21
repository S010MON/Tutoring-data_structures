package dataStructures.linkedList;

/**
 * INSTRUCTIONS:  read through ALL the comments first, then implement the methods in order.
 * Test each method as you complete it, there is a helpful guide to the `Node` class at the bottom
 */
public class MyLinkedListImp<E> implements MyLinkedList<E>
{
    // TODO: You may need to add some field variables ...

    @Override
    public void add(E element)
    {
        // TODO: Your code here, implement me first!
    }

    @Override
    public int size()
    {
        // TODO: Your code here, implement me second.
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        // TODO: Your code here, implement me third.
        return false;
    }

    @Override
    public E get(int index)
    {
        // TODO: Your code here, implement me fourth.
        return null;
    }

    @Override
    public void remove(int index)
    {
        // TODO: Your code here, implement me last.
    }

    @Override
    public void remove(E element)
    {
        // TODO: Your code here, implement me last.
    }
}


/**
 * Use the Node class to save the value and the next node in the chain.
 * This has already been implemented in the package, this is here so you can see what
 * is accessible and how.
 *
class Node<T>
{
    public Node next;
    public T value;

    public Node(T value)
    {
        this.next = null;
        this.value = value;
    }

    public boolean hasNext()
    {
        return !(next == null);
    }
}*/
