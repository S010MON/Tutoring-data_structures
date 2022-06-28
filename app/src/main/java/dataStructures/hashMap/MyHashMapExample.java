package dataStructures.hashMap;

public class MyHashMapExample<K, V> implements MyHashMap<K, V>
{
    private HashNode<V>[] array;                // An array of HashNodes that are the head for linked lists of values

    /**
     * Constructor, initialise the list of HashNodes that hold the values
     */
    public MyHashMapExample()
    {
        array = new HashNode[4];
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
        int hash = Math.abs(key.hashCode());                // Hash the key, abs is used to make sure it is positive
        if(hash >= array.length)
            array = resize(array, hash);                    // If the hash is out of bounds, then resize the array

        if(array[hash] != null)                             // If the array at index [hash] is full, resolve conflict
        {
            HashNode<V> current = array[hash];
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = new HashNode<>(value);
        }
        else                                                // Else just add the node into the array
            array[hash] = new HashNode<>(value);
    }

    @Override
    public V get(K key)
    {
        int hash = Math.abs(key.hashCode());
        return array[hash].value;
    }

    @Override
    public boolean contains(Object key)
    {
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    private HashNode[] resize(HashNode[] old_array, int n)
    {
        HashNode[] new_array = new HashNode[n+1];
        System.arraycopy(old_array, 0, new_array, 0, old_array.length);
        return new_array;
    }
}

class HashNode<V>
{
    public V value;
    public HashNode<V> next;

    public HashNode(V value)
    {
        this.value = value;
        next = null;
    }
}
