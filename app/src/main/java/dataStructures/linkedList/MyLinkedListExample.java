package dataStructures.linkedList;

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
        // Deal with root being element to remove
        if(root.value == element) {
            root = root.next;
            size--;
        }

        Node<T> previousNode = root;            // We keep track of the previous node to reset the pointer
        Node<T> currentNode = root.next;
        while (currentNode.hasNext())
        {
            if(currentNode.value == element) {
                previousNode.next = currentNode.next;   // Remove the link to the item, let garbage collector deal with rest
                size--;
            }

            previousNode = previousNode.next;
            currentNode = currentNode.next;
        }
    }

    @Override
    public void remove(int index)
    {
        if(index == 0)
        {
            root = root.next;
            size--;
            return;
        }

        int counter = 0;
        Node<T> previousNode = root.next;
        Node<T> currentNode = root;
        while (counter != index && currentNode.hasNext())
        {
            previousNode = currentNode;
            currentNode = currentNode.next;
            counter++;
        }

        previousNode.next = currentNode.next;
        size--;
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
