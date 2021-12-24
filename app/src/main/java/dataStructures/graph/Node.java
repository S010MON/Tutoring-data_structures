package dataStructures.graph;

import java.util.ArrayList;

public class Node<E>
{
    private ArrayList<Node> edges;
    public E value;

    public Node(E value)
    {
        this.value = value;
        edges = new ArrayList<>();
    }

    public void addEdge(Node n)
    {
        edges.add(n);
    }

    public ArrayList<Node> getEdges()
    {
        return edges;
    }

}
