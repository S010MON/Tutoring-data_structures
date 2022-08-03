package dataStructures.arrayList;

public class MyArrayListImp<T> implements MyArrayList<T>
{
    private T[] list;           // The array where we hold all our data in memory
    private int size = 0;       // The number of elements we have actually added to the list

    public MyArrayListImp()
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
        // TODO resize the array if it is full, and add the last element.  Check out the resize() method
    }

    private T[] resize(T[] oldList)
    {
        // TODO calculate n! This value determines the size of the new list (should not be 0)
        int n = 0;
        T[] newList = (T[]) new Object[n];      // Create a new list of size n

        // TODO add your code to add all the elements to the new list and increment the size

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
        /* TODO add your code here:
            if the element is the last element, we can just remove it and decrement the size
            if the element is in the middle, use the shiftLeft method to correct the gap left
         */
    }

    /**
     * Remove the element from the array list (compared by element content)
     * @param element a type E to be removed from the ArrayList
     */
    @Override
    public void remove(T element)
    {
        /* TODO add your code here:
            To remove an element we need to first find it, and then remove it by index
         */
    }

    private void shiftLeft(int fillIndex)
    {
        /* TODO  add your code here:
            If we remove 3, then we need to shift everything left after it to close the gap we have just made
            [0][1][2][3][4][5][6]  ->  [0][1][2][ ][4][5][6] ->  [0][1][2][4][5][6][ ]
            add your code to fill the index and shift everything else over
         */
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
