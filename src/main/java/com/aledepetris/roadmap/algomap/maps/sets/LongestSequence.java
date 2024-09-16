package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. Longest Consecutive Sequence - Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 */
public class LongestSequence {

    public int longestConsecutive(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        int actualLength = 1;
        int longest = 0;

        for (Integer value : numsSet) {
            if (!numsSet.contains(value - 1)) {
                int plus = 1;
                while (numsSet.contains(value + plus)) {
                    actualLength += 1;
                    plus++;
                }
            }

            if (actualLength > longest ) {
                longest = actualLength;
            }
            actualLength = 1;

        }

        return longest;

    }

}
