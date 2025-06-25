package com.aledepetris.leetcode.daily.challenge;

import java.util.Arrays;

public class KthSmallestProductTwoSortedArrays {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {

        int n = nums1.length;
        int m = nums2.length;

        long[] products = new long[n*m];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                products[idx] = nums1[i] * nums2[j];
                idx++;
            }
        }

        Arrays.sort(products);
        return products[(int) k - 1];

    }
}
