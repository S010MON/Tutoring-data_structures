package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 This class is to serve as an implementation of Dijkstra's shortest path algorithm.
 The following link provides a video tutorial of the process and a visual of the first graph over
 which Dijkstra's algorithm will be tested:
 https://youtu.be/bZkzH5x0SKU

The following link provides an example of an implemented Dijkstra's algorithm:
 https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
 */
public class Dijkstra {
    private int[][] graph;
    private ArrayList<Integer> vertexVisited = new ArrayList<>();
    private ArrayList<Integer> vertexNotVisited = new ArrayList<>();
    private int[] distances;


    /**
     * Constructor for the Dijkstra object.
     * @param graph The graph at which you would like to calculate the shortest path for.
     */
    public Dijkstra(int[][] graph)
    {
        this.graph = graph;
        distances = new int[graph.length];
        Arrays.fill(distances, Integer.MAX_VALUE);
    }

    /**
    This method  calculates the shortest distance from the root node to all other nodes in the graph using Dijkstra's algorithm.
     @param root The root node from which the shortest distance to all other nodes must be calculated.
     */
    public double[] findShortestPath(int root)
    {
        return null;
    }
}
