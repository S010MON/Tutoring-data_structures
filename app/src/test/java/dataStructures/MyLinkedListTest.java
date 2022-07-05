package dataStructures;

import dataStructures.linkedList.MyLinkedList;
import dataStructures.linkedList.MyLinkedListExample;
import dataStructures.linkedList.MyLinkedListImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest
{
    @Test void testAdd()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
    }

    @Test void testGet()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
        assertEquals(0, list.get(0));
        assertEquals(10, list.get(10));
        assertEquals(999, list.get(999));
    }

    @Test void testSize_0()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        assertEquals(0, list.size());
    }

    @Test void testSize_gt0()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
        assertEquals(1000, list.size());
    }

    @Test void testRemoveHead()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }

        if(list.get(0) == null)
            fail("\nLeon says:\nget() method must be implemented first!\n");

        assertEquals(0, list.get(0));
        list.remove(0);

        if(list.size() == 0)
            fail("\nLeon says:\nsize() method must be implemented first!\n");

        assertEquals(999, list.size());
        assertEquals(1, list.get(0));
        assertEquals(999, list.get(998));
    }

    @Test void testRemoveTail()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }

        if(list.get(0) == null)
            fail("\nLeon says:\nget() method must be implemented first!\n");

        assertEquals(0, list.get(0));
        list.remove(999);

        if(list.size() == 0)
            fail("\nLeon says:\nsize() method must be implemented first!\n");

        assertEquals(999, list.size());
        assertEquals(998, list.get(999));
    }

    @Test void testRemoveMiddle()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }

        if(list.get(0) == null)
            fail("\nLeon says:\nget() method must be implemented first!\n");

        assertEquals(0, list.get(0));
        list.remove(500);

        if(list.size() == 0)
            fail("\nLeon says:\nsize() method must be implemented first!\n");

        assertEquals(999, list.size());
        assertEquals(499, list.get(499));
        assertEquals(501, list.get(500));
    }
}
