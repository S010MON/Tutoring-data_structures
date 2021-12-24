package dataStructures.linkedList;

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
