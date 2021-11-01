package dataStructures;

public class MyStackImp<T> implements MyStack<T>
{

    private T[] list;

    public MyStackImp()
    {
        list = (T[]) new Object[4];
    }

    @Override
    public void push(T element) {

    }

    @Override
    public T pop()
    {
        return null;
    }

    @Override
    public T peek()
    {
        return null;
    }

    private T[] resize(T[] list)
    {
        return null;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }
}
