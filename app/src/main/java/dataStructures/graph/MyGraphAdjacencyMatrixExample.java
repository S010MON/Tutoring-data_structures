package dataStructures.graph;

public class MyGraphAdjacencyMatrixExample<E> implements MyGraph<E>
{
    private E[] vertices;
    private int[][] adjMatrix;


    @Override public void addVertex(E value)
    {

    }

    @Override public boolean removeVertex(E value)
    {
        return false;
    }

    @Override public void addEdge(E valueFrom, E valueTo)
    {

    }

    @Override public boolean removeEdge(E valueFrom, E valueTo)
    {
        return false;
    }

    @Override public int edges()
    {
        // To calculate this, we need to count through every single pair of vertices and see how many
        // non-null values we have.  Complexity O(n^2)  where n is the number of vertices.

        int sum = 0;

        for(int[] column : adjMatrix)
        {
            for(int cell : column)
            {
                if(cell != 0)
                    sum++;
            }
        }
        return sum;
    }

    @Override public int vertices()
    {
        // To calculate the number of vertices, we only need to return the number of vertices we have

        return 0;
    }

    @Override public E depthFirstSearch(E value)
    {
        return null;
    }

    @Override public E breadthFirstSearch(E value)
    {
        return null;
    }
}
