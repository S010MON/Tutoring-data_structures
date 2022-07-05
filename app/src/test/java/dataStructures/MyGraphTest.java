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

    @Test void testAddEdge()
    {
        MyGraph<Integer> G = new MyGraphEdgeListExample<>();

        G.addVertex(1);
        G.addVertex(2);
        G.addEdge(1,2);

        assertEquals(1, G.edges());
    }

    @Test void testAddEdgeMany()
    {
        MyGraph<Integer> G = new MyGraphEdgeListExample<>();

        for(int i = 0; i < 100 ; i++)
            G.addVertex(i);

        for(int i = 1; i < 100 ; i++)
            G.addEdge(0, i);

        assertEquals(99, G.edges());
    }

    @Test void testAddEdgeRepeated()
    {
        MyGraph<Integer> G = new MyGraphEdgeListExample<>();

        G.addVertex(1);
        G.addVertex(2);
        G.addEdge(1,2);
        G.addEdge(1,2);

        if(G.edges() == 2)
        {
            System.out.println("\n**NOTE** Two of the same edge were added - when adding an edge check whether it is already in graph!");
        }

        assertEquals(1, G.edges());
    }
}
