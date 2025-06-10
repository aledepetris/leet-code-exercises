package com.aledepetris.leetcode.daily.challenge;

import java.util.HashMap;
import java.util.Map;

public class MaxDifferenceEvenOddFrequencyI {

    public int maxDifference(String s) {
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (int freq : freqMap.values()) {
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        return maxOdd - minEven;
    }

}
