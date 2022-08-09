package dataStructures.queue;

public interface MyQueue<T>
{
    /**
     * Add a new element to the back of the queue
     * @param element to be added
     */
    void enqueue(T element);

    /**
     * Return the front element of the queue and remove it from
     * the data structure.  Throw a runtime exception if the queue is empty
     * @return the front element
     */
    T dequeue();

    /**
     * Take a look at the front of the queue without removing it
     * @return the first element of the queue
     */
    T first();

    /**
     * @return the number of elements in the queue
     */
    int size();

    /**
     * @return {@code true} if the Queue is empty
     */
    boolean isEmpty();
}
