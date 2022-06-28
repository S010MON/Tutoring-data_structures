package dataStructures.hashMap;

public interface MyHashMap<K, V>
{
    void put(K key, V value);

    V get(K key);

    boolean contains(K key);

    boolean isEmpty();
}
