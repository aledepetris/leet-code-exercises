package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element - Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than [n / 2] times. You may assume that the majority
 * element always exists in the array.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> mapMajority = new HashMap<>();
        for (int num : nums) {
            mapMajority.put(num, mapMajority.getOrDefault(num, 0) + 1);
        }

        int maxCant = 0;
        int majority = 0;
        for (var entry: mapMajority.entrySet()) {
            if (entry.getValue() > maxCant) {
                majority = entry.getKey();
                maxCant = entry.getValue();
            }
        }

        return majority;

    }

}
