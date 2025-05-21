package com.aledepetris.roadmap.algomap.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 283. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {


    List<Object> objects = new ArrayList<>();

    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        while(r < nums.length) {
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
    }

}
