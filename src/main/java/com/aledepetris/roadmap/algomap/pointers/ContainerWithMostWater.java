package com.aledepetris.roadmap.algomap.pointers;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int distance = right - left;
            int area = distance * minHeight;
            if (area > maxArea) {
                maxArea = area;
            }
            if ( height[left] <= height[right]) left++;
            else right--;
        }

        return maxArea;

    }

}
