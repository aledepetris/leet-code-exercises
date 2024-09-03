package com.aledepetris.roadmap.algomap.arrays;

/**
 * 1768 - Given an integer array nums of size n, return the number with the value closest to 0 in nums.
 * If there are multiple answers, return the number with the largest value.
 */
public class ClosestNumberToZero {

    public int findClosestNumber(int[] nums) {
        int minDistance = Math.abs(nums[0]);
        int closest = nums[0];

        for (int i =1; i < nums.length; i++) {
            int distanceToZero = Math.abs(nums[i]);
            if (distanceToZero < minDistance) {
                minDistance = distanceToZero;
                closest = nums[i];
            } else if (distanceToZero == minDistance && closest < nums[i]) {
                closest = nums[i];
            }

        }
        return closest;
    }
}