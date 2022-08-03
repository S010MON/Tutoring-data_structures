package dataStructures.arrayList;

public class MyArrayListExample<T> implements MyArrayList<T>
{
    private T[] list;
    private int size = 0;

    public MyArrayListExample()
    {
        list = (T[]) new Object[2];
    }

    /**
     * Add an element to the end of the array list
     * @param element
     */
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

    /**
     * Get an element from the array list at the point index
     * @param index a non-negative index between zero and the size of the list minus 1
     * @return an element of type E
     */
    @Override
    public T get(int index)
    {
        return list[index];
    }


    /**
     * Remove the element at the index, filling the gap left by the removal
     * @param index a non-negative index between zero and the size of the list minus 1
     */
    @Override
    public void remove(int index)
    {
        shiftLeft(index);
        size--;
    }

    private void shiftLeft(int fillIndex)
    {
        for(int i = fillIndex; i < list.length-1; i++)
        {
            list[i] = list[i+1];
        }
    }

    /**
     * Remove the element from the array list (compared by element content)
     * @param element a type E to be removed from the ArrayList
     */
    @Override
    public void remove(T element)
    {
        for(int i = 0; i < size; i++)
        {
            if(list[i] == element)
                remove(i);
        }
    }

    /**
     * @return the integer number of elements in the list
     */
    @Override
    public int size()
    {
        return size;
    }

    /**
     * @return true if the list is empty, false if the list contains any elements
     */
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }
}
