package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DijkstraTest {
    /**
     * The graph and exersize is sourced from: https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
     * The expected output for this test is as follows:
     * Vertex          Distance from Source
     * 0                  0
     * 1                  4
     * 2                  12
     * 3                  19
     * 4                  21
     * 5                  11
     * 6                  9
     * 7                  8
     * 8                  14
     */
    @Test void testSimpleGraph()
    {
        int[][] graph = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        Dijkstra alg = new Dijkstra(graph);
        int[] shortest_dist = alg.findShortestPath(0);
        assertEquals(shortest_dist, new int[]{0, 4, 12, 19, 21, 11, 9, 8, 14});
    }
}
