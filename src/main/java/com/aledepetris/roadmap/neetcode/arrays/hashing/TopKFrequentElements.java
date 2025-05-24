package com.aledepetris.roadmap.neetcode.arrays.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums ) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> array = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            array.add(new int[] {entry.getValue(), entry.getKey()});
        }
        array.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = array.get(i)[1];
        }

        return res;

    }

}
