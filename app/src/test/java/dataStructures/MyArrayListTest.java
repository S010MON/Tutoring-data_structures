package dataStructures;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest
{
    @Test void testAdd()
    {
        MyArrayList<Integer> list = new MyArrayListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
    }

    @Test void testGet()
    {
        MyArrayList<Integer> list = new MyArrayListImp<>();
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
        MyArrayList<Integer> list = new MyArrayListImp<>();
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
        MyArrayList<Integer> list = new MyArrayListImp<>();
        assertEquals(0, list.size());
    }

    @Test void testSize_gt0()
    {
        MyArrayList<Integer> list = new MyArrayListImp<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
        assertEquals(1000, list.size());
    }
}
