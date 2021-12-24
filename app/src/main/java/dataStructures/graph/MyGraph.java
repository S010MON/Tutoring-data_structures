package dataStructures.graph;

public interface MyGraph<E>
{
    /** Adds a new vertex into the graph with the value {@code value} */
    public void addVertex(E value);

    /** Connects the nodes u and v with an edge */
    public void addEdge(E valueU, E valueV);

    /** Conducts a depth first search on the graph for the value */
    public Node depthFirstSearch(E value);

    /** Conducts a breadth first search on the graph for the value */
    public Node breadthFirstSearch(E value);
}