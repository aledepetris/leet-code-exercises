package com.aledepetris.roadmap.algomap.stringsarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix - Given an m x n matrix, return all elements of the matrix in spiral order.
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0;
        int col = -1;
        int direction = 1;

        List<Integer> ans = new ArrayList<>();

        while (rows > 0 && columns > 0) {

            for (int i = 0; i < columns; i++) {
                col += direction;
                ans.add(matrix[row][col]);
            }
            rows--;

            for (int i=0; i < rows; i++) {
                row += direction;
                ans.add(matrix[row][col]);
            }
            columns--;
            direction *= -1;
        }

        return ans;
    }

}
