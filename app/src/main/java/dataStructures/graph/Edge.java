package dataStructures.graph;

public class Edge<E>
{
    public E from;
    public E to;

    public Edge(E from, E to)
    {
        this.from = from;
        this.to = to;
    }
}
