package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.*;

/**
 * 49. Group Anagrams - Given an array of strings strs, group the  anagrams together.
 * You can return the answer in any order.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            String sortedWord = orderLetters(word);
            map.computeIfAbsent(sortedWord, key -> new ArrayList<>());
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    private String orderLetters(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }

}
