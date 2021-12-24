package dataStructures.stack;

public class MyStackExample<T> implements MyStack<T>
{

    private T[] list;
    private int last;

    public MyStackExample()
    {
        list = (T[]) new Object[4];
        last = -1;
    }

    @Override
    public void push(T element)
    {
        if(last+1 >= list.length)
            list = resize(list);

        list[++last] = element;
    }

    @Override
    public T pop()
    {
        if(last < 0)
            throw new RuntimeException();
        return list[last--];
    }

    @Override
    public T peek()
    {
        if(last < 0)
            throw new RuntimeException();
        return list[last];
    }

    private T[] resize(T[] list)
    {
        T[] newList = (T[]) new Object[list.length * 2];
        for(int i = 0; i < list.length; i++)
        {
            newList[i] = list[i];
        }
        return newList;
    }

    @Override
    public boolean isEmpty()
    {
        return last == -1;
    }
}
