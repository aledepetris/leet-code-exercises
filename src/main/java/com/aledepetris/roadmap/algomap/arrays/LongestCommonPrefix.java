package com.aledepetris.roadmap.algomap.arrays;

/**
 * 14. Longest Common Prefix - Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int minLenght = 200;

        for (String s : strs) {
            if (s.length() < minLenght) {
                minLenght = s.length();
            }
        }

        boolean match = false;
        int largest = 0;
        for (int i = 0; i < minLenght; i++) {
            char letterToCompare = strs[0].charAt(i);
            for(String s: strs) {
                if (letterToCompare == s.charAt(i)) {
                    match = true;
                } else {
                    match = false;
                    break;
                }
            }
            if (!match) break;
            largest += 1;
        }

        return strs[0].substring(0, largest);

    }

}
