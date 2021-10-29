package dataStructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest
{
    @Test void testAdd()
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 1000; i++)
        {
            list.add(i);
        }
    }

    @Test void testGet()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

    }

    @Test void testRemove()
    {

    }

    @Test void testSize_0()
    {

    }

    @Test void testSize_gt0()
    {

    }
}
