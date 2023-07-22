package algorithms;

import java.util.ArrayList;
import java.util.Arrays;


public class DijkstraExample
{
    private int[][] graph;
    private ArrayList<Integer> vertexVisited = new ArrayList<>();
    private ArrayList<Integer> vertexNotVisited = new ArrayList<>();

    private int[] prevNodes;

    private int[] distances;

    /**
     * Constructor for the Dijkstra object.
     * @param graph The graph at which you would like to calculate the shortest path for.
     */
    public DijkstraExample(int[][] graph)
    {
        this.graph = graph;
        distances = new int[graph.length];
        prevNodes = new int[graph.length];

        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(prevNodes, -1);

        populateVertexNotVisited(graph.length);
    }

    /**
     * Populates the vertexNotVisited field with vertices according to the size of the graph.
     * Assumes that the provided 2-dimensional graph representation is square
     * @param graphSize The number of nodes contained within the graph
     */
    public void populateVertexNotVisited(int graphSize)
    {
        for(int i=0; i<graphSize; i++)
        {
            this.vertexNotVisited.add(i);
        }
    }

    /**
     Calculates the shortest distance from the root node to all other nodes in the graph using Dijkstra's algorithm.
     @param root The root node from which the shortest distance to all other nodes must be calculated.
     */
    public int[] findShortestPath(int root)
    {
        distances[root] = 0;  // Initialize the starting nodes distance to zero
        int currentNode = root;  // Initialize the current node to point to the root
        int currentDistance = 0;  // Initialize the current distance travelled

        while(!vertexNotVisited.isEmpty())
        {
            ArrayList<Integer> unvisitedNeighbours = findUnvisitedNeighbours(currentNode);  // Gather the unvisited neighbours of the current node
            findNearestNeighbours(currentNode, unvisitedNeighbours, currentDistance);  // This function performs updates on the table by finding the nearest neighbours

            vertexNotVisited.remove((Integer)currentNode);  // Remove the current node from unvisited vertices
            vertexVisited.add(currentNode);  // Add current node to visited vertices

            currentNode = findNextNode(currentNode);  // Determine next node (shortest distance)
            if(currentNode != -1)  // Conditional for accounting for the end of the algorithm
                currentDistance = distances[currentNode];
        }
        return distances;
    }

    /**
     * Find all the unvisited vertices of the current node
     * @param currentNode The current node at which to find the unvisited vertices
     * @return An ArrayList containing all neighbouring nodes
     */
    public ArrayList<Integer> findUnvisitedNeighbours(int currentNode)
    {
        ArrayList<Integer> neighbours = new ArrayList<>();
        int[] row = this.graph[currentNode]; // Accesses the current node row. This contains all connections to other nodes

        for(int i=0; i< row.length; i++)
        {
            if(row[i] != 0 && vertexNotVisited.contains(i))  // Connection exists as value is not zero and is unvisited
            {
                neighbours.add(i);
            }
        }
        return neighbours;
    }

    /**
     * Finds the nearest neighbours based in the unvisited nodes and the current node in order to update the *table* of distances.
     * @param currentNode The current node neighboured by the unvisitedNeighbours
     * @param unvisitedNeighbours  Unvisited nodes neighbouring the current node
     * @param currentDistance  The distance already covered to reach the current node. This is factored in, in distance calculations
     */
    public void findNearestNeighbours(int currentNode, ArrayList<Integer> unvisitedNeighbours, int currentDistance)
    {
        int[] row = this.graph[currentNode];  // Access the row of the graph leading to a nodes connections

        for(int i=0; i<unvisitedNeighbours.size(); i++) {
            int neighbour = unvisitedNeighbours.get(i);  // Specify the current neighbour
            int altDistance = row[neighbour] + currentDistance;  // Update the distance with that already travelled so far

            if (distances[neighbour] > altDistance) {  //New distance is shorter than the one saved.
                distances[neighbour] = altDistance;  // Update distances with a closer one found
                prevNodes[neighbour] = currentNode;  //Update the previous nodes with the current node.
            }
        }
    }

    /**
     * Finds the next node based on the shortest distance in the table,
     * ensuring this node is unvisited and not equal to the current node.
     * @param currentNode  The current node at which the table values were updated.
     * @return An integer value indicating the next node.
     */
    public int findNextNode(int currentNode)
    {
        int minDistance = Integer.MAX_VALUE;  // Initialize the minDistance to be a big number
        int nextNode = -1;  // Initialize the next node container (-1 indicates no node is selected)

        for(int i=0; i<distances.length; i++)
        {
            int distance = distances[i];  // Extract distance to reach node
            if(i != currentNode && distance < minDistance && vertexNotVisited.contains(i))  // Cannot be the same node, distance must be shorter, and must be unvisited
            {
                minDistance = distance;  // Update minDistance
                nextNode = i;  // Update next node container
            }
        }
        return nextNode;
    }
}
