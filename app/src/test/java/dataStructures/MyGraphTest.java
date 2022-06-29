package dataStructures;

import dataStructures.graph.MyGraph;
import dataStructures.graph.MyGraphEdgeListExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyGraphTest
{
    @Test void testAddVertex()
    {
        MyGraph<Integer> G = new MyGraphEdgeListExample<>();

        for(int i = 0; i < 100 ; i++)
            G.addVertex(i);

        assertEquals(100, G.vertices());
    }

    @Test void testAddVertexRepeated()
    {
        MyGraph<Integer> G = new MyGraphEdgeListExample<>();

        for(int i = 0; i < 100 ; i++)
            G.addVertex(1);

        assertEquals(1, G.vertices());
    }
}
