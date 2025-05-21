package com.aledepetris.roadmap.neetcode.arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int size = s.length();
        int[] counter = new int[26];

        for (int i = 0; i < size; i++) {
            counter[s.charAt(i) - 'a'] ++;
            counter[t.charAt(i) - 'a'] --;
        }

        for (int i : counter) {
            if (i != 0) return false;
        }
        return true;
    }
}
