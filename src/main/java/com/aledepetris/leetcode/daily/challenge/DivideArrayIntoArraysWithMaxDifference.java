package com.aledepetris.leetcode.daily.challenge;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {

    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int div = n / 3;
        int[][] result = new int[div][3];

        for (int i = 0; i < n; i = i + 3) {
            int dif1 = Math.abs(nums[i] - nums[i+1]);
            int dif2 = Math.abs(nums[i] - nums[i+2]);
            int dif3 = Math.abs(nums[i+1] - nums[i+2]);
            if (dif1 <= dif2 && dif2 <= dif3 && dif3 <= k) {
                result[i][0] = nums[i];
                result[i][1] = nums[i+1];
                result[i][2] = nums[i+2];
            } else {
                return new int[0][0];
            }
        }

        return result;

    }

}
