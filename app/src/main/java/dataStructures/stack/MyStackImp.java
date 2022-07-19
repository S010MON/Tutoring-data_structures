package dataStructures.stack;

public class MyStackImp<T> implements MyStack<T>
{

    private T[] list;

    /**
     * Constructor that creates and initialises the object
     */
    public MyStackImp()
    {
        list = (T[]) new Object[4];
    }

    /**
     * Push a new element onto the top of the stack
     * @param element
     */
    @Override
    public void push(T element) {

    }

    /**
     * Return the top element from the stack, removing it from the list
     * if the stack is empty, throw a runtime exception
     * @return element
     */
    @Override
    public T pop()
    {
        return null;
    }

    /**
     * Return the top element from the stack, WITHOUT removing it from the list
     * if the stack is empty, throw a runtime exception
     * @return element
     */
    @Override
    public T peek()
    {
        return null;
    }

    /**
     * Return a new list at twice the size of the original list with all the elements
     * entered as in the original
     * @param list
     * @return
     */
    private T[] resize(T[] list)
    {
        return null;
    }

    /**
     * @return {@code true} if  the stack is empty, {@code false} if contains elements
     */
    @Override
    public boolean isEmpty()
    {
        return false;
    }
}
