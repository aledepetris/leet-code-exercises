package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku - Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated
 * according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
public class Sudoku {

    public boolean isValidSudoku(char[][] board) {

        int size = board.length;
        for (int i=0; i < size; i++ ) {
            Set<Character> countRow = new HashSet<>();
            Set<Character> countColumn = new HashSet<>();
            for (int j=0; j < size; j++ ) {
                char valueRow = board[i][j];
                char valueColumn = board[j][i];
                if(countRow.contains(valueRow) && valueRow != '.') {
                    return false;
                }
                if(countColumn.contains(valueColumn) && valueColumn != '.') {
                    return false;
                }
                countRow.add(valueRow);
                countColumn.add(valueColumn);
            }
            countRow.clear();
            countColumn.clear();
        }

        int k = 0;
        int m = 0;
        while( k < size && m < size) {
            Set<Character> countBox = new HashSet<>();
            for (int i=k; i < k + 3; i++ ) {
                for (int j=m; j < m + 3; j++ ) {
                    char value = board[i][j];
                    if(countBox.contains(value) && value != '.') {
                        return false;
                    }
                    countBox.add(value);
                }
            }
            k += 3;
            if (k == size) {
                m += 3;
                k = 0;
            }
        }
        return true;
    }

}
