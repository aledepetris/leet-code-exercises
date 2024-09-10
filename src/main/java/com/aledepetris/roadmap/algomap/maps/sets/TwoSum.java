package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Suma - Given an array of integers nums and an integer target, return indices of the two numbers such that
 * they add up to target. You may assume that each input would have exactly one solution, and you may not use the same
 * element twice. You can return the answer in any order.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                int indexComplement = numMap.get(complement);
                if (indexComplement != i) {
                    return new int[] { i, indexComplement };
                }
            }
            numMap.put(nums[i], i);
        }

        return new int[] {};

    }


}
