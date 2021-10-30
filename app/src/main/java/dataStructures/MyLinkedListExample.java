package dataStructures;

public class MyLinkedListExample<T> implements MyLinkedList<T>
{
    private Node<T> root;
    private int size = 0;

    @Override
    public void add(T element)
    {
        if(root == null)
        {
            root = new Node<>(element);
        }
        else
        {
            Node<T> currentNode = root;
            while (currentNode.hasNext())
            {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(element);
        }
        size++;
    }

    @Override
    public T get(int index)
    {
        int counter = 0;
        Node<T> currentNode = root;
        while (counter != index && currentNode.hasNext())
        {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode.value;
    }

    @Override
    public void remove(T element)
    {

    }

    @Override
    public void remove(int index)
    {

    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }
}

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
}
