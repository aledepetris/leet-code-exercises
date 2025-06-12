package com.aledepetris.leetcode.daily.challenge;

public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {

    public int maxAdjacentDistance(int[] nums) {
        int size = nums.length;
        int maxDiff = Math.abs(nums[0] - nums[size-1]);
        for (int i = 0; i <= size - 2; i++) {
            int value = Math.abs(nums[i] - nums[i+1]);
            if (value > maxDiff) maxDiff = value;
        }
        return maxDiff;
    }

}
