package dataStructures.hashMap;

public class MyHashMapImp<K, V> implements MyHashMap<K, V>
{
    /** An array of HashNodes that are the buckets for multiple values (or linked list heads per bucket) */
    private HashNode<K, V>[] array;             // Take a look at HashNode implementation to see what you can do with it


    /**
     * Constructor, initialise the list of HashNodes that hold the values
     */
    public MyHashMapImp()
    {
        // TODO Add your code here, implement me first!
    }


    /**
     * Put a ket/value pair into the hashMap, use the {@code hashCode()} method that is implemented in every object as
     * default.  This will return an integer value hash of the object.
     * @param key - A unique key that will be hashed (potentially two keys hash to the same integer)
     * @param value - The value of type `V` that will need to be stored
     */
    @Override
    public void put(K key, V value)
    {
        // TODO Add your code here, implement me second!
    }


    /**
     * Find the value associated with the key
     * @param key - A unique hashable object
     * @return V value (the associated value of type V) Ensure that you return the right value in cases where two objects
     * hash to the same integer (Hint: use the keys to check the buckets)
     */
    @Override
    public V get(K key)
    {
        // TODO Add your code here, implement me third!
        return null;
    }


    @Override
    public boolean contains(K key)
    {
        // TODO Add your code here
        return false;
    }


    @Override
    public boolean isEmpty()
    {
        // TODO Add your code here
        return false;
    }


    @Override public int size()
    {
        return 0;
    }


    @Override public boolean remove(K key)
    {
        return false;
    }


    @Override public boolean remove(K key, V value)
    {
        return false;
    }
}
