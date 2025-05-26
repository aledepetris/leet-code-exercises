package com.aledepetris.roadmap.algomaster.arrays;

import java.util.Arrays;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int smallest = 1;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
    }

}
