package dataStructureExersizes;

import dataStructures.queue.MyQueue;
import dataStructures.queue.MyQueueImp;
import dataStructures.queue.ReverseQueueExersize;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseQueue {

    @Test void testShortQueue()
    {
        MyQueue<Integer> queue = new MyQueueImp<>();
        queue.enqueue(5);
        queue.enqueue(100);
        queue.enqueue(3);
        queue.enqueue(86);
        queue.enqueue(19);

        MyQueue<Integer> reversedQueue = ReverseQueueExersize.reverseQueue(queue);

        assertEquals(reversedQueue.dequeue(), 19);
        assertEquals(reversedQueue.dequeue(), 86);
        assertEquals(reversedQueue.dequeue(), 3);
        assertEquals(reversedQueue.dequeue(), 100);
        assertEquals(reversedQueue.dequeue(), 5);
    }

    public ArrayList<Double> generateRandomList()
    {
        int queueSize = 100;
        Random rand = new Random();
        ArrayList<Double> valueList = new ArrayList<>();

        for(int i=0; i < queueSize; i++)
        {
            double randValue = rand.nextDouble();
            valueList.add(randValue);
        }
        return valueList;
    }

    public MyQueue<Double> listToQueue(ArrayList<Double> valueList)
    {
        MyQueue<Double> queue = new MyQueueImp<>();

        for(double value: valueList)
        {
            queue.enqueue(value);
        }
        return queue;
    }

    @Test void testLongQueue()
    {
        ArrayList<Double> randList = generateRandomList();
        MyQueue<Double> queue = listToQueue(randList);

        MyQueue<Double> reversedQueue = ReverseQueueExersize.reverseQueue(queue);
        Collections.reverse(randList);

        for(double reversedValue: randList)
        {
            assertEquals(reversedValue, reversedQueue.dequeue());
        }
    }
}
