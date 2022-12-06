package com.quynh;

import java.util.Arrays;

public class MST {
    public void Prim(int G[][], int V) {

        int INF = 9999999;

        int edges; // number of edge

        // create a boolean array to store included vertices
        boolean[] selected = new boolean[V];

        // set selected false initially since there's no included vertex in tree
        Arrays.fill(selected, false);

        // set number of edge to 0
        edges = 0;

        // edges in MST will be < V - 1


        // choose 0th vertex and make it true since we include the first vertex in tree
        selected[0] = true;


        System.out.println("Edge : Weight");

        while (edges < V - 1) {
            // For every vertex in set, find the all adjacent vertices
            // and calculate the distance from the vertex selected at step 1.

            // if the vertex is already in the set, ignore it then
            // choose another vertex nearest to selected vertex at step 1.

            int min = INF;
            int x = 0; // row number
            int y = 0; // col number

            for (int i = 0; i < V; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < V; j++) {
                        // haven't been selected and there is an edge
                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println( (x + 1) + " - " + (y + 1) + " :  " + G[x][y]);
            selected[y] = true;
            edges++;
        }
    }
    public static void main(String[] args) {
        MST g = new MST();

        // number of vertices in graph
        int V = 8;

        // create adjacency matrix to represent graph

        int[][] G = { {0, 5, 4, 0, 0, 0, 0, 0},
                { 5, 0, 2, 3, 0, 0, 0, 0 },
                { 4, 2, 0, 0, 4, 0, 0, 0 },
                { 0, 3, 0, 0, 2, 0, 6, 0 },
                { 0, 0, 4, 2, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 8, 0 },
                { 0, 0, 0, 6, 0, 0, 0, 2 },
                { 0, 0, 0, 0, 0, 0, 2, 0 } };

        g.Prim(G, V);
    }
}
