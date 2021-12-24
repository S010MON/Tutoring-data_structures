package dataStructures.graph;

import java.util.ArrayList;

public class MyGraphImp<E> implements MyGraph<E>
{
    private ArrayList<Node> nodes;

    public MyGraphImp()
    {
        nodes = new ArrayList<>();
    }

    @Override
    public void addVertex(E value)
    {
           nodes.add(new Node<>(value));
    }

    @Override
    public void addEdge(E valueU, E valueV)
    {
        Node u = null;
        Node v = null;
        for (Node n: nodes)
        {
               if(n.value == valueU)
                   u = n;
               if(n.value == valueV)
                   v = n;
        }

        assert v != null && u != null;

        u.addEdge(v);
        v.addEdge(u);
    }

    @Override
    public Node depthFirstSearch(E value) {
        return null;
    }

    @Override
    public Node breadthFirstSearch(E value) {
        return null;
    }
}
