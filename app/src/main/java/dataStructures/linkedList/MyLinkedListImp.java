package dataStructures.linkedList;

/**
 * INSTRUCTIONS:  read through ALL the comments first, then implement the methods in order.
 * Test each method as you complete it, there is a helpful guide to the `Node` class at the bottom
 */
public class MyLinkedListImp<E> implements MyLinkedList<E>
{
    // TODO: You may need to add some field variables ...
    // `head` a Node where the start of the LinkedList is
    // `size` a way to keep track of the size

    /**
     * Add an element to the end of the linked list
     * @param element
     */
    @Override
    public void add(E element)
    {
        // TODO: Your code here, implement me first!
    }

    /**
     * @return the integer number of elements in the list
     */
    @Override
    public int size()
    {
        // TODO: Your code here, implement me second.
        return 0;
    }

    /**
     * @return true if the list is empty, false if the list contains any elements
     */
    @Override
    public boolean isEmpty()
    {
        // TODO: Your code here, implement me third.
        return false;
    }

    /**
     * Get an element from the list at the point index
     * @param index a non-negative index between zero and the size of the list minus 1
     * @return an element of type E
     */
    @Override
    public E get(int index)
    {
        // TODO: Your code here, implement me fourth.
        return null;
    }

    /**
     * Remove the element at the index, filling the gap left by the removal
     * @param index a non-negative index between zero and the size of the list minus 1
     */
    @Override
    public void remove(int index)
    {
        // TODO: Your code here, implement me last.
    }

    /**
     * Remove the element from the list (compared by element content)
     * @param element a type E to be removed from the ArrayList
     */
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
