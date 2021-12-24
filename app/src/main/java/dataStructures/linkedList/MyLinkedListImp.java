package dataStructures.linkedList;

public class MyLinkedListImp<E> implements MyLinkedList<E>
{

    @Override
    public void add(E element) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void remove(E element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
