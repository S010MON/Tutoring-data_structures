package dataStructures.queue;

public interface MyQueue<T>
{
    /**
     * Add a new element to the back of the queue
     * @param element
     */
    void enqueue(T element);

    /**
     * Return the front element of the queue and remove it from
     * the data structure.  Throw a runtime exception if the queue is empty
     * @return the front element
     */
    T dequeue();


    boolean isEmpty();
}
