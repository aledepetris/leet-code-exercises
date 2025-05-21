package com.aledepetris.roadmap.algomaster.arrays;

public class MoveZeroes {

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
