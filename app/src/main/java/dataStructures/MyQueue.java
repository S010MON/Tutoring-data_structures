package dataStructures;

public interface MyQueue<E>
{
    void enqueue(E element);

    E dequeue();

    boolean isEmpty();
}
