package com.aledepetris.leetcode.daily.challenge;

import java.util.*;

public class MinimumDeletionsMakeStringKSpecial {
    public int minimumDeletions(String word, int k) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(map.values());
        Collections.sort(counts);

        int n = counts.size();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int range = counts.get(i) + k;
            int total = counts.get(i);

            for (int j = i + 1; j < n; j++) {
                if (counts.get(j) > range)
                    total += range;
                else
                    total += counts.get(j);
            }

            int remain = word.length() - total;
            ans = Math.min(ans, remain);
        }


        return ans;

    }
}
