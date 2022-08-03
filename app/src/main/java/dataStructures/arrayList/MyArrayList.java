package dataStructures.arrayList;

public interface MyArrayList<E>
{
    /**
     * Add an element to the end of the array list
     * @param element
     */
    void add(E element);

    /**
     * Get an element from the array list at the point index
     * @param index a non-negative index between zero and the size of the list minus 1
     * @return an element of type E
     */
    E get(int index);

    /**
     * Remove the element at the index, filling the gap left by the removal
     * @param index a non-negative index between zero and the size of the list minus 1
     */
    void remove(int index);

    /**
     * Remove the element from the array list (compared by element content)
     * @param element a type E to be removed from the ArrayList
     */
    void remove(E element);

    /**
     * @return the integer number of elements in the list
      */
    int size();

    /**
     * @return true if the list is empty, false if the list contains any elements
     */
    boolean isEmpty();
}
