package com.aledepetris.roadmap.algomap.pointers;

/**
 * 977. Squares of a Sorted Array - Given an integer array nums sorted in non-decreasing order, return an array of
 * the squares of each number sorted in non-decreasing order.
 */
public class SquaresSorted {

    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int count = nums.length - 1;

        int[] squaresNums = new int[nums.length];

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                squaresNums[count] = nums[left] * nums[left];
                left++;
            } else {
                squaresNums[count] = nums[right] * nums[right];
                right--;
            }
            count--;
        }

        return squaresNums;

    }

}
