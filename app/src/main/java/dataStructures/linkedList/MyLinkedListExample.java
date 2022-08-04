package dataStructures.linkedList;

public class MyLinkedListExample<T> implements MyLinkedList<T>
{
    private Node<T> root;
    private int size = 0;

    /**
     * Add an element to the end of the linked list
     * @param element
     */
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

    /**
     * @return the integer number of elements in the list
     */
    @Override
    public int size()
    {
        return size;
    }

    /**
     * @return true if the list is empty, false if the list contains any elements
     */
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    /**
     * Get an element from the list at the point index
     * @param index a non-negative index between zero and the size of the list minus 1
     * @return an element of type E
     */
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

    /**
     * Remove the element at the index, filling the gap left by the removal
     * @param index a non-negative index between zero and the size of the list minus 1
     */
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

    /**
     * Remove the element from the list (compared by element content)
     * @param element a type E to be removed from the ArrayList
     */
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


}
