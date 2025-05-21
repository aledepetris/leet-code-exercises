package com.aledepetris.roadmap.neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }

        return false;

    }

}
