package com.aledepetris.leetcode.daily.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxNumTargetNodesConnectingTreesII {

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        // Crear listas de adyacencia
        int n1 = edges1.length + 1;
        int n2 = edges2.length + 1;
        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();

        for (int i = 0; i <= n1; i++) adj1.add(new ArrayList<>());
        for (int i = 0; i <= n2; i++) adj2.add(new ArrayList<>());

        for (int[] edge : edges1) {
            adj1.get(edge[0]).add(edge[1]);
            adj1.get(edge[1]).add(edge[0]);
        }

        for (int[] edge : edges2) {
            adj2.get(edge[0]).add(edge[1]);
            adj2.get(edge[1]).add(edge[0]);
        }

        // Paso 1: calcular lo mejor que se puede lograr en el árbol 2
        int evenCount2 = bfs(0, adj2, null);
        int oddCount2 = n2 - evenCount2;
        int best2 = Math.max(evenCount2, oddCount2);

        // Paso 2: BFS en árbol 1 para marcar niveles pares
        boolean[] included = new boolean[n1];
        int evenCount1 = bfs(0, adj1, included);

        // Paso 3: calcular resultado para cada nodo
        int[] ans = new int[n1];
        for (int i = 0; i < n1; ++i) {
            if (included[i]) {
                ans[i] = evenCount1 + best2;
            } else {
                ans[i] = (n1 - evenCount1) + best2;
            }
        }

        return ans;
    }

    // BFS que:
    // 1) Cuenta los nodos en niveles pares
    // 2) Si `included` no es null, marca esos nodos
    private int bfs(int start, List<List<Integer>> adj, boolean[] included) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, -1});
        int count = 0;
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            if (level % 2 == 0)
                count += size;

            while (size-- > 0) {
                int[] currPair = q.poll();
                int curr = currPair[0];
                int parent = currPair[1];

                if (included != null && level % 2 == 0) {
                    included[curr] = true;
                }

                for (int v : adj.get(curr)) {
                    if (v == parent) continue;
                    q.add(new int[]{v, curr});
                }
            }
            ++level;
        }
        return count;
    }
}
