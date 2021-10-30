package dataStructures;

public class MyArrayListImp<T> implements MyArrayList<T>
{
    private T[] list;           // The array where we hold all our data in memory
    private int size = 0;       // The number of elements we have actually added to the list

    public MyArrayListImp()
    {
        list = (T[]) new Object[2];
    }

    @Override
    public void add(T element)
    {
        // TODO resize the array if it is full, and add the last element
    }

    private T[] resize(T[] oldList)
    {
        int n = 0;                              // This value determines the size of the new list
        T[] newList = (T[]) new Object[n];      // Create a new list of size n

        // TODO add your code to add all the elements to the new list and increment the size

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
        /* TODO add your code here:
            To remove an element we need to first find it, and then remove it by index
         */
    }

    @Override
    public void remove(int index)
    {
        /* TODO add your code here:
            if the element is the last element, we can just remove it and decrement the size
            if the element is in the middle, use the shiftRight method to correct the gap left
         */
    }

    private void shiftRight(int fillIndex)
    {
        /* TODO  add your code here:
            If we remove 3, then we need to shift everything left after it to close the gap we have just made
            [0][1][2][3][4][5][6]  ->  [0][1][2][ ][4][5][6] ->  [0][1][2][4][5][6][ ]
            add your code to fill the index and shift everything else over
         */
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
