package dataStructures.graph;

import java.util.ArrayList;
import java.util.HashSet;

public class MyGraphEdgeListExample<E> implements MyGraph<E>
{
    private HashSet<E> vertices;
    private ArrayList<Edge<E>> edges;

    public MyGraphEdgeListExample()
    {
        vertices = new HashSet<>();
        edges = new ArrayList<>();
    }


    /**
     * Adds a new vertex into the graph with the value {@code value}
     *
     * @param value the value of the vertex to be added
     */
    @Override public void addVertex(E value)
    {
        vertices.add(value);
    }


    /**
     * Remove a vertex from the graph
     *
     * @param value the value of the vertex to be removed
     * @return {@code true} if the edge was successfully removed, {@code false} otherwise
     */
    @Override public boolean removeVertex(E value)
    {
        return vertices.remove(value);
    }


    /**
     * Connects the nodes u and v with an edge
     *
     * if an edge is attempted to be added without the value being in the graph
     * a {@code runtimeException} is thrown with the message "valueFrom node not found in graph"
     * or "valueFrom node not found in graph"
     *
     * @param valueFrom the value from which the edge starts
     * @param valueTo the value to which the edge goes
     */
    @Override public void addEdge(E valueFrom, E valueTo)
    {
        if(!vertices.contains(valueFrom))
            throw new RuntimeException("valueFrom node not found in graph");
        if(!vertices.contains(valueTo))
            throw new RuntimeException("valueTo node not found in graph");

        edges.add(new Edge<>(valueFrom, valueTo));
    }

    /**
     * Removes the edge connecting the from value to the to value
     *
     * @param valueFrom the value from which the edge starts
     * @param valueTo the value to which the edge goes
     * @return {@code true} if the edge was successfully removed, {@code false} otherwise
     */
    @Override public boolean removeEdge(E valueFrom, E valueTo)
    {
        for(Edge<E> currentEdge: edges)
        {
            if(currentEdge.to.equals(valueFrom) && currentEdge.from.equals(valueFrom))
            {
                edges.remove(currentEdge);
                return true;
            }
        }

        return false;
    }

    /**
     * @return the number of edges in the graph
     */
    @Override public int edges()
    {
        return edges.size();
    }

    /**
     * @return the number of vertices in the graph
     */
    @Override public int vertices()
    {
        return vertices.size();
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
