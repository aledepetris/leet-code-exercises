package com.aledepetris.leetcode.daily.challenge;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {

        List<Integer> nums = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            nums.add(count);
            if (count * 10 <= n) {
                count *= 10;
            } else {
                if (count >= n) count /= 10;
                count++;
                while (count % 10 == 0) {
                    count /= 10;
                }
            }
        }

        return nums;

    }

}
