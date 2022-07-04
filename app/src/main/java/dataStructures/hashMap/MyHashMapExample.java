package dataStructures.hashMap;

public class MyHashMapExample<K, V> implements MyHashMap<K, V>
{
    private HashNode<K, V>[] array;                // An array of HashNodes that are the head for linked lists of values
    private  int size = 0;

    /**
     * Constructor, initialise the list of HashNodes that hold the values
     */
    public MyHashMapExample()
    {
        array = new HashNode[16];
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
            HashNode<K, V> current = array[hash];
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = new HashNode<>(key, value);

        }
        else                                                // Else just add the node into the array
            array[hash] = new HashNode<>(key, value);

        size++;
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
        int hash = Math.abs(key.hashCode());                // First hash the key to find the bucket for that key
        HashNode<K, V> bucket = array[hash];

        if(bucket.next == null)                             //  If the bucket has no next, then we know it is the right value!
            return bucket.value;

        while(!bucket.key.equals(key))
            bucket = bucket.next;

        return bucket.value;
    }


    @Override public boolean remove(K key)
    {
        return false;
    }


    @Override public boolean remove(K key, V value)
    {
        return false;
    }


    @Override
    public boolean contains(K key)
    {
        return get(key) != null;
    }


    @Override public int size()
    {
        return size;
    }


    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    private HashNode[] resize(HashNode[] old_array, int n)
    {
        HashNode[] new_array = new HashNode[n+1];
        System.arraycopy(old_array, 0, new_array, 0, old_array.length);
        return new_array;
    }
}
