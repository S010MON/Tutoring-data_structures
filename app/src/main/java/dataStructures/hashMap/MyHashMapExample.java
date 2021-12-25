package dataStructures.hashMap;

public class MyHashMapExample<K,V> implements MyHashMap
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
        int hash = key_.hashCode();
        if(hash >= values.length)
            values = resize(values, hash);

        values[hash] = (V) value_;
    }

    @Override
    public Object get(Object key) {
        return null;
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
        for(int i = 0; i < old_array.length; i++)
        {
            new_array[i] = old_array[i];
        }
        return new_array;
    }
}
