package dataStructures.queue;

public interface MyQueue<T>
{
    void enqueue(T element);

    T dequeue();

    boolean isEmpty();
}
