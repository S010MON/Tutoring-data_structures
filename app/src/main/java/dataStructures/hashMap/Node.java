package dataStructures.hashMap;

public class Node<K, V>
{
    private int hash;
    private K key;
    private V value;
    private Node next;
    private Node previous;

    public Node(K key, V value)
    {
        this.hash = key.hashCode();
        this.key = key;
        this.value = value;
        next = null;
        previous = null;
    }

    public int getHash()
    {
        return hash;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

    public void setNext(Node n)
    {
        next = n;
    }

    public void setPrevious(Node n)
    {
        previous = n;
    }

    public Node getNext()
    {
        return next;
    }

    public Node getPrevious()
    {
        return previous;
    }

    public boolean hasNext()
    {
        return  next != null;
    }

    public boolean hasPrev()
    {
        return previous != null;
    }
}
