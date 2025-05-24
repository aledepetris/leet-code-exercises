package com.aledepetris.roadmap.algomaster.arrays;

public class ProductOfArrayExceptSelf {


    public int[] productExceptSelf(int[] nums) {

        int size = nums.length;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < size; i++) {
            answer[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }

}
