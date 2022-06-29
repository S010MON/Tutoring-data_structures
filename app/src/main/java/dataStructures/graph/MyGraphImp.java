package dataStructures.graph;

public class MyGraphImp<E> implements MyGraph<E>
{

    /**
     * Adds a new vertex into the graph with the value {@code value}
     *
     * @param value the value of the vertex to be added
     */
    @Override public void addVertex(E value)
    {

    }

    /**
     * Remove a vertex from the graph
     *
     * @param value the value of the vertex to be removed
     * @return {@code true} if the edge was successfully removed, {@code false} otherwise
     */
    @Override public boolean removeVertex(E value)
    {
        return false;
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
        return false;
    }


    /**
     * @return the number of edges in the graph
     */
    @Override public int edges()
    {
        return 0;
    }


    /**
     * @return the number of vertices in the graph
     */
    @Override public int vertices()
    {
        return 0;
    }

    /**
     * Conducts a depth first search on the graph for the value
     *
     * @param value the value being searched for
     * @return the node it has been found at, or {@code null} if not found
     */
    @Override public E depthFirstSearch(E value)
    {
        return null;
    }


    /**
     * Conducts a breadth first search on the graph for the value
     *
     * @param value the value being searched for
     * @return the node it has been found at, or {@code null} if not found
     */
    @Override public E breadthFirstSearch(E value)
    {
        return null;
    }
}
