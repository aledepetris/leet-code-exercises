package com.aledepetris.leetcode.daily.challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingRobotPrintLexicographicallySmallestString {
    public String robotWithString(String s) {
        int n = s.length();
        char[] minSuffix = new char[n];
        minSuffix[n-1] = s.charAt(n-1);
        for (int i = n-2; i >= 0; i--) {
            minSuffix[i] = (char) Math.min(s.charAt(i), minSuffix[i+1]);
        }

        Deque<Character> t = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            t.push(s.charAt(i));
            while (!t.isEmpty()  && (i+1 == n || t.peek() <= minSuffix[i+1])) {
                sb.append(t.pop());
            }
        }

        return sb.toString();

    }
}
