package dataStructures.hashMap;

public class MyHashMapExample<K,V> implements MyHashMap<K,V>
{
    private V[] values;

    public MyHashMapExample()
    {
        values = (V[]) new Object[100];
    }

    @Override
    public void put(Object key, Object value)
    {
        K key_ = (K) key;
        V value_ = (V) value;
        int hash = Math.abs(key_.hashCode());
        if(hash >= values.length)
            values = resize(values, hash);

        values[hash] = value_;
    }

    @Override
    public Object get(Object key) {
        K key_ = (K) key;
        int hash = Math.abs(key_.hashCode());
        return values[hash];
    }

    @Override
    public boolean contains(Object key) {
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    private V[] resize(V[] old_array, int n)
    {
        V[] new_array = (V[]) new Object[n+1];
        System.arraycopy(old_array, 0, new_array, 0, old_array.length);
        return new_array;
    }
}
