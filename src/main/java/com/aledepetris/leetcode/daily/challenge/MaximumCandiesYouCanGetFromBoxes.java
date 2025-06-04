package com.aledepetris.leetcode.daily.challenge;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumCandiesYouCanGetFromBoxes {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {

        int total = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] locked = new boolean[status.length];

        for (int ib : initialBoxes) {
            if (status[ib] == 1) queue.add(ib);
            else locked[ib] = true;
        }

        while(!queue.isEmpty()) {
            int box = queue.remove();
            total += processBox(box, status, candies, keys, containedBoxes, queue, locked);
        }

        return total;
    }

    private int processBox(int box, int[] status, int[] candies, int[][] keys, int[][] containedBoxes, Queue<Integer> queue, boolean[] lockedBoxes) {
        for (int key : keys[box]) {
            status[key] = 1;
            if (lockedBoxes[key]) {
                queue.add(key);
                lockedBoxes[key] = false;
            }
        }

        for (int cb : containedBoxes[box]) {
            if (status[cb] == 1) queue.add(cb);
            else lockedBoxes[cb] = true;
        }

        return candies[box];
    }
}
