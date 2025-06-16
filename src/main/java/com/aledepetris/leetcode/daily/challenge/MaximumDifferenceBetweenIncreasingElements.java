package com.aledepetris.leetcode.daily.challenge;

public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDifference = -1;
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = i + 1; j < n; j++) {
                int result = nums[j] - nums[i];
                if (result > maxDifference && result != 0) maxDifference = result;
            }
        }

        return maxDifference;
    }
}
