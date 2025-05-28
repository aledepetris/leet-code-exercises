package com.aledepetris.roadmap.algomaster.strings;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) return s;

        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        int index = 0;
        int value = 1;
        char[] array = s.toCharArray();
        for (char c : array) {
            rows[index].add(c);
            if (index == 0) value = 1;
            if (index == numRows-1) value = -1;
            index += value;
        }

        StringBuilder sb = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                sb.append(c);
            }
        }

        return sb.toString();

    }

}
