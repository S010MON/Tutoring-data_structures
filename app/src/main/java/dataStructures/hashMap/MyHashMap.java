package dataStructures.hashMap;

public interface MyHashMap<K, V>
{
    void put(K key, V value);

    V get(K key);

    boolean remove(K key);

    boolean remove(K key, V value);

    boolean contains(K key);

    int size();

    boolean isEmpty();
}
