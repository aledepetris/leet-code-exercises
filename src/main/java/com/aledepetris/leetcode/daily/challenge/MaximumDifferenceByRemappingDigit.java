package com.aledepetris.leetcode.daily.challenge;

public class MaximumDifferenceByRemappingDigit {

    public int minMaxDifference(int num) {

        String value = String.valueOf(num);
        int n = value.length();

        // finding de Max.
        int indexMax = 0;
        int indexMin = 0;
        boolean foundMin = false;
        boolean foundMax = false;

        for (char c : value.toCharArray()) {
            if (!foundMax) {
                if (c == '9') indexMax++;
                else foundMax = true;
            }
            if (!foundMin) {
                if (c == '0') indexMin++;
                else foundMin = true;
            }
        }

        String maxNum = value;
        String minNum = value;
        if (indexMax < n) maxNum = value.replace(value.charAt(indexMax), '9');
        if (indexMin < n) minNum = value.replace(value.charAt(indexMin), '0');

        return Integer.valueOf(maxNum) - Integer.valueOf(minNum);

    }

}
