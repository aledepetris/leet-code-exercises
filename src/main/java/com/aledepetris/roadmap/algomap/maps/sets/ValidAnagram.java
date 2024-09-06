package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram - Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> anagramCheck = new HashMap<>();

        for (char c : s.toCharArray()) {
            int value = anagramCheck.getOrDefault(c,0);
            anagramCheck.put(c, value + 1);
        }

        for (char c : t.toCharArray()) {
            int value = anagramCheck.getOrDefault(c,0);
            anagramCheck.put(c, value - 1);
        }

        for (int val : anagramCheck.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;

    }

}
