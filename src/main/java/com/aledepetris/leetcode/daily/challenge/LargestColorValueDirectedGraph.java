package com.aledepetris.leetcode.daily.challenge;

import java.util.ArrayList;
import java.util.List;

public class LargestColorValueDirectedGraph {

    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        int[][] longest = new int[26][n];

        int maxColorLength = 0;
        int[] visited = new int[n];

        // 0: unvisisted | 1: visited & processing | 2 visited & processed
        for (int i = 0; i < n; ++i) {
            int res = dfs(i, adj, visited, longest, colors);
            if (res == Integer.MAX_VALUE) return -1;
            maxColorLength = Math.max(maxColorLength, res);
        }
        return maxColorLength;
    }

    private int dfs(int curr, List<List<Integer>> adj, int[] visited, int[][] longest, String colors) {
        if (visited[curr] == 1)
            return Integer.MAX_VALUE;

        if (visited[curr] == 0) {
            visited[curr] = 1;
            for (int nbr : adj.get(curr)) {
                int res = dfs(nbr, adj, visited, longest, colors);
                if (res == Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                for (int i = 0; i < 26; ++i)
                    longest[i][curr] = Math.max(longest[i][curr], longest[i][nbr]);
            }
            longest[colors.charAt(curr) - 'a'][curr]++;
            visited[curr] = 2;
        }
        return longest[colors.charAt(curr) - 'a'][curr];
    }

}
