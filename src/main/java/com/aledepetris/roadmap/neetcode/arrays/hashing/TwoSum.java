package com.aledepetris.roadmap.neetcode.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mapNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapNums.put(nums[i], i);
        }

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mapNums.containsKey(complement) && mapNums.get(complement) != i) {
                result[0] = i;
                result[1] = mapNums.get(complement);
                break;
            }
        }

        return result;

    }

}
