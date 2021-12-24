package dataStructures.stack;

public interface MyStack<E>
{
    void push(E element);

    E pop();

    E peek();

    boolean isEmpty();
}
