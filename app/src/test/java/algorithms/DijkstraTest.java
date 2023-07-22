package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int[][] graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                         {4, 0, 8, 0, 0, 0, 0, 11, 0},
                         {0, 8, 0, 7, 0, 4, 0, 0, 2},
                         {0, 0, 7, 0, 9, 14, 0, 0, 0},
                         {0, 0, 0, 9, 0, 10, 0, 0, 0},
                         {0, 0, 4, 14, 10, 0, 2, 0, 0},
                         {0, 0, 0, 0, 0, 2, 0, 1, 6},
                         {8, 11, 0, 0, 0, 0, 1, 0, 7},
                         {0, 0, 2, 0, 0, 0, 6, 7, 0}};

        DijkstraExample alg = new DijkstraExample(graph);
        int[] shortest_dist = alg.findShortestPath(0);
        assertArrayEquals(shortest_dist, new int[]{0, 4, 12, 19, 21, 11, 9, 8, 14});
    }

    /**
     * This test is linked to the video explaining the algorithm.
     * It may provide an advantage and increase in understanding to debug your code and follow the video as the same
     * time tyo determine where a mistake may have been made.
     */
    @Test void testSimpleGraphAlternative()
    {
        int[][] graph = {{0, 2, 0, 8, 0, 0},
                         {2, 0, 0, 5, 6, 0},
                         {0, 0, 0, 0, 9, 3},
                         {8, 5, 0, 0, 3, 2},
                         {0, 6, 9, 3, 0, 1},
                         {0, 0, 3, 2, 1, 0}};

        DijkstraExample alg = new DijkstraExample(graph);
        int[] shortest_dist = alg.findShortestPath(0);
        assertArrayEquals(shortest_dist, new int[]{0, 2, 12, 7, 8, 9});
    }
}
