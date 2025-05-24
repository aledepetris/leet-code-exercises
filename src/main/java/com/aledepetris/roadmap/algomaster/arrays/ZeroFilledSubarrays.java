package com.aledepetris.roadmap.algomaster.arrays;

import java.util.HashMap;
import java.util.Map;

public class ZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {

        Map<Integer, Integer> zeroCounts = new HashMap<>();

        int zeroInARow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroInARow++;
            } else if (zeroInARow > 0) {
                zeroCounts.put(zeroInARow, zeroCounts.getOrDefault(zeroInARow, 0) + 1);
                zeroInARow = 0;
            }
        }

        if (zeroInARow > 0) {
            zeroCounts.put(zeroInARow, zeroCounts.getOrDefault(zeroInARow, 0) + 1);
        }

        long result = 0;
        for (Map.Entry<Integer, Integer> entry : zeroCounts.entrySet()) {
            long subResult = sum(entry.getKey()) * entry.getValue();
            result += subResult;
        }

        return result;
    }

    private long sum(long num) {
        long sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

}
