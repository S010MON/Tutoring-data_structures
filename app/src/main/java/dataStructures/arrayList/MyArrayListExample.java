package dataStructures.arrayList;

public class MyArrayListExample<T> implements MyArrayList<T>
{
    private T[] list;
    private int size = 0;

    public MyArrayListExample()
    {
        list = (T[]) new Object[2];
    }

    @Override
    public void add(T element)
    {
        if(size+1 >= list.length)
            list = resize(list);
        list[size++] = element;
    }

    private T[] resize(T[] oldList)
    {
        T[] newList = (T[]) new Object[oldList.length * 2];
        for(int i = 0; i < oldList.length; i++)
        {
            newList[i] = oldList[i];
        }
        return newList;
    }

    @Override
    public T get(int index)
    {
        return list[index];
    }

    @Override
    public void remove(T element)
    {
        for(int i = 0; i < size; i++)
        {
            if(list[i] == element)
                remove(i);
        }
    }

    @Override
    public void remove(int index)
    {
        shiftRight(index);
        size--;
    }

    private void shiftRight(int fillIndex)
    {
        for(int i = fillIndex; i < list.length-1; i++)
        {
            list[i] = list[i+1];
        }
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }
}
