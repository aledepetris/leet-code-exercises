package com.aledepetris.leetcode.daily.challenge;

import java.util.ArrayList;
import java.util.List;

public class MaxNumTargetNodesConnectingTreesI {

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {

        List<List<Integer>> adj2 = buildAdjList(edges2);
        int m = adj2.size();
        int maxiB = 0;

        for (int i = 0; i < m; i++) {
            maxiB = Math.max(maxiB, dfs(adj2, i, 1, k-1));
        }

        List<List<Integer>> adj1 = buildAdjList(edges1);
        int n = adj1.size();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = dfs(adj1, i, -1, k) + maxiB;
        }

        return res;

    }

    private int dfs(List<List<Integer>> adj, int u, int p, int k) {
        if (k < 0)
            return 0;
        int count = 1;
        for (int v : adj.get(u)) {
            if (v != p) {
                count += dfs(adj, v, u, k - 1);
            }
        }
        return count;
    }

    private List<List<Integer>> buildAdjList(int [][] edges) {
        int n = 0;
        for (int[] edge : edges) {
            n = Math.max(n, Math.max(edge[0],edge[1]));
        }
        n++;

        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        return adj;
    }

}
