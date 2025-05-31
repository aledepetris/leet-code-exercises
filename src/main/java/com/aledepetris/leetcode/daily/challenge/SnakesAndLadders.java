package com.aledepetris.leetcode.daily.challenge;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {

    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] cells = get1DArray(board);

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n * n + 1];
        queue.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                if (curr == n * n) return moves;
                for (int i = 1; i <= 6 && curr + i <= n * n; i++) {
                    int next = curr + i;
                    if (cells[next] != -1) next = cells[next];
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    private int[] get1DArray(int[][] board) {
        int n = board.length;
        int[] cells = new int[n * n + 1];
        int index = 1;
        boolean leftToRight = true;
        for (int i = n - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    cells[index++] = board[i][j];
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    cells[index++] = board[i][j];
                }
            }
            leftToRight = !leftToRight;
        }
        return cells;
    }

}
