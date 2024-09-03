package com.aledepetris.roadmap.algomap.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. Summary Ranges
 * You are given a sorted unique integer array nums. A range [a,b] is the set of all integers from a to b (inclusive).
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of
 * nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:  - "a->b" if a != b  - "a" if a == b
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> ranges = new ArrayList<>();
        int large = 0;
        if (nums.length == 1) {
            ranges.add(String.valueOf(nums[0]));
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - 1 == nums[i-1]) {
                    large++;
                    if (i == nums.length - 1) {
                        ranges.add(nums[i-large] + "->" + nums[i]);
                    }
                } else {
                    if (large == 0) {
                        ranges.add(String.valueOf(nums[i-1]));
                    } else {
                        ranges.add(nums[i-1-large] + "->" + nums[i-1]);
                    }
                    large = 0;
                    if (i == nums.length - 1) {
                        ranges.add(String.valueOf(nums[i]));
                    }
                }
            }
        }
        return ranges;
    }

}
