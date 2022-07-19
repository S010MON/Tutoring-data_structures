package dataStructures.stack;

public interface MyStack<E>
{
    /**
     * Push a new element onto the top of the stack
     * @param element
     */
    void push(E element);

    /**
     * Return the top element from the stack, removing it from the list
     * if the stack is empty, throw a runtime exception
     * @return element
     */
    E pop();

    /**
     * Return the top element from the stack, WITHOUT removing it from the list
     * if the stack is empty, throw a runtime exception
     * @return element
     */
    E peek();

    /**
     * @return {@code true} if  the stack is empty, {@code false} if contains elements
     */
    boolean isEmpty();
}
