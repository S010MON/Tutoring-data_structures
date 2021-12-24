package dataStructures.linkedList;

public interface MyLinkedList<E>
{
    void add(E element);

    E get(int index);

    void remove(E element);

    void remove(int index);

    int size();

    boolean isEmpty();
}
