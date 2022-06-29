package dataStructures.graph;

public interface MyGraph<E>
{
    /**
     * Adds a new vertex into the graph with the value {@code value}
     */
    void addVertex(E value);

    /**
     * Remove a vertex from the graph
     *
     * @param value the value of the vertex to be added
     * @return {@code true} if the edge was successfully removed, {@code false} otherwise
     */
    boolean removeVertex(E value);

    /**
     * Connects the nodes u and v with an edge
     * if an edge is attempted to be added without the value being in the graph
     * a {@code runtimeException} is thrown with the message "valueFrom node not found in graph"
     * or "valueFrom node not found in graph"
     */
    void addEdge(E valueFrom, E valueTo);


    /**
     * Removes the edge connecting the from value to the to value
     *
     * @param valueFrom the value from which the edge starts
     * @param valueTo the value to which the edge goes
     * @return {@code true} if the edge was successfully removed, {@code false} otherwise
     */
    boolean removeEdge(E valueFrom, E valueTo);


    /**
     * @return the number of edges in the graph
     */
    int edges();


    /**
     * @return the number of vertices in the graph
     */
    int vertices();


    /**
     * Conducts a depth first search on the graph for the value
     * @param value the value being searched for
     * @return the node it has been found at, or {@code null} if not found
     */
    E depthFirstSearch(E value);

    /** Conducts a breadth first search on the graph for the value
     * @param value the value being searched for
     * @return the node it has been found at, or {@code null} if not found
     */
    E breadthFirstSearch(E value);
}