package com.aledepetris.leetcode.daily.challenge;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeBy2LetterWords {

    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }


        int count = 0, alreadyPalindrome = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String w = entry.getKey();
            int freq = entry.getValue();
            String reverse = new StringBuilder(w).reverse().toString();
            if (w.equals(reverse)) {
                count += (freq / 2) * 4;
                if (freq % 2 == 1)
                    alreadyPalindrome = 1;
            } else if (w.compareTo(reverse) < 0 && map.containsKey(reverse)) {
                count += Math.min(freq, map.get(reverse)) * 4;
            }
        }
        return count + alreadyPalindrome * 2;
    }

}
