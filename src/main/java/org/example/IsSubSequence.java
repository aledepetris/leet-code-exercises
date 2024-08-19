package org.example;

/**
 * 392. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a
 * subsequence of "abcde" while "aec" is not).
 */
public class IsSubSequence {

    public boolean isSubsequence(String subSequence, String sequence) {
        int n = subSequence.length();
        int m = sequence.length();
        int i = 0;
        for(int j = 0; j < m; j++) {
            if(i == n) return true;
            if(sequence.charAt(j) == subSequence.charAt(i)) {
                i++;
            }
        }
        return i == n;
    }

}
