package dataStructures;

import dataStructures.stack.MyStack;
import dataStructures.stack.MyStackImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyStackTest
{
    @Test void testPush()
    {
        MyStack<Integer> stack = new MyStackImp<>();
        for (int i = 0; i < 1000; i++)
        {
            stack.push(i);
        }
    }

    @Test void testPop()
    {
        MyStack<Integer> stack = new MyStackImp<>();
        for (int i = 0; i < 1000; i++)
        {
            stack.push(i);
        }
        for (int i = 999; i >= 0; i--)
        {
            assertEquals(i, stack.pop());
        }
    }

    @Test void testPeek()
    {
        MyStack<Integer> stack = new MyStackImp<>();
        for (int i = 0; i < 1000; i++)
        {
            stack.push(i);
        }
        for (int i = 999; i >= 0; i--)
        {
            assertEquals(999, stack.peek());
        }
    }

    @Test void testIsEmpty_true()
    {
        MyStack<Integer> stack = new MyStackImp<>();
        assertTrue(stack.isEmpty());
    }

    @Test void testIsEmpty_false()
    {
        MyStack<Integer> stack = new MyStackImp<>();
        stack.push(0);
        assertFalse(stack.isEmpty());
    }
}
