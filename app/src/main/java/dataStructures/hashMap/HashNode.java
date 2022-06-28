package dataStructures.hashMap;

public class HashNode<K,V>
{
    public V value;
    public K key;
    public HashNode<K,V> next;

    public HashNode(K key, V value)
    {
        this.key = key;
        this.value = value;
        next = null;
    }
}
