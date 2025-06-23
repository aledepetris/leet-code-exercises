package com.aledepetris.leetcode.daily.challenge;

public class SumOfKMirrorNumbers {

    public long kMirror(int k, int n) {
        int count = 0;
        long sum = 0;

        // Primero los palíndromos impares
        for (int len = 1; count < n; len++) {
            for (int root = (int) Math.pow(10, (len - 1) / 2); count < n && root < Math.pow(10, (len + 1) / 2); root++) {
                long palindrome = createPalindrome(root, len % 2 == 1);
                if (isMirror(toBaseK(palindrome, k))) {
                    sum += palindrome;
                    count++;
                }
            }
        }

        return sum;
    }

    private long createPalindrome(int root, boolean odd) {
        String s = Integer.toString(root);
        StringBuilder sb = new StringBuilder(s);
        int start = odd ? s.length() - 2 : s.length() - 1;
        while (start >= 0) {
            sb.append(s.charAt(start--));
        }
        return Long.parseLong(sb.toString());
    }

    private String toBaseK(long num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % base);
            num /= base;
        }
        return sb.reverse().toString();
    }

    private boolean isMirror(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

}
