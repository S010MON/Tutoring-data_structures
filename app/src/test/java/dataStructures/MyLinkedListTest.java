package dataStructures;

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

    @Test void testRemove()
    {
        MyLinkedList<Integer> list = new MyLinkedListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
        assertEquals(0, list.get(0));
        list.remove(0);
        assertEquals(1, list.get(0));
        assertEquals(999, list.get(998));
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
}
