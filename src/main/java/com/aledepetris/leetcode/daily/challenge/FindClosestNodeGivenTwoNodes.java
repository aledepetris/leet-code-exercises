package com.aledepetris.leetcode.daily.challenge;

import java.util.Arrays;

public class FindClosestNodeGivenTwoNodes {

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] dist1 = getDistances(edges, node1);
        int[] dist2 = getDistances(edges, node2);
        int result = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < edges.length; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int maxDistance = Math.max(dist1[i], dist2[i]);
                if (maxDistance < minDistance) {
                    minDistance = maxDistance;
                    result = i;
                }
            }
        }

        return result;

    }

    private int[] getDistances(int[] edges, int start) {
        int n = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        int d = 0;
        while (start != -1 && dist[start] == -1) {
            dist[start] = d++;
            start = edges[start];
        }
        return dist;
    }

}
