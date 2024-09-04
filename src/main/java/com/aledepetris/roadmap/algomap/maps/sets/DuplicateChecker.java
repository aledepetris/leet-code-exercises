package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate - Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class DuplicateChecker {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num: nums) {
            if (numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }

}
