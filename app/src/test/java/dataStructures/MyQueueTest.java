package dataStructures;

import dataStructures.queue.MyQueue;
import dataStructures.queue.MyQueueExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyQueueTest
{
    @Test void testEnqueue()
    {
        MyQueue<Integer> Q = new MyQueueExample<>();
        for (int i = 0; i < 1000; i++)
        {
            Q.enqueue(i);
        }
    }

    @Test void testDequeue()
    {
        MyQueue<Integer> Q = new MyQueueExample<>();
        for (int i = 0; i < 1000; i++)
        {
            Q.enqueue(i);
        }
        for (int i = 0; i < 1000; i++)
        {
            assertEquals(i, Q.dequeue());
        }
    }

    @Test void isEmpty_true_start()
    {
        MyQueue<Integer> Q = new MyQueueExample<>();
        assertTrue(Q.isEmpty());
    }

    @Test void isEmpty_true_after()
    {
        MyQueue<Integer> Q = new MyQueueExample<>();
        Q.enqueue(1);
        Q.dequeue();
        assertTrue(Q.isEmpty());
    }

    @Test void isEmpty_false()
    {
        MyQueue<Integer> Q = new MyQueueExample<>();
        Q.enqueue(1);
        assertFalse(Q.isEmpty());
    }
}
