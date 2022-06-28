package dataStructures.graph;

public interface MyGraph<E>
{
    /** Adds a new vertex into the graph with the value {@code value} */
    void addVertex(E value);

    /** Connects the nodes u and v with an edge */
    void addEdge(E valueU, E valueV);

    /** Conducts a depth first search on the graph for the value */
    Node depthFirstSearch(E value);

    /** Conducts a breadth first search on the graph for the value */
    Node breadthFirstSearch(E value);
}