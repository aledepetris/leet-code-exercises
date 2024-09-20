package com.aledepetris.roadmap.algomap.pointers;

/**
 * 125. Valid Palindrome - Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class Palindrome {

    public boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        char[] charArray = s.toCharArray();

        while (left < right) {
            if(!Character.isLetterOrDigit(charArray[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(charArray[right])) {
                right--;
            } else {
                if (charArray[left] == charArray[right]) {
                    left ++;
                    right --;
                } else {
                    return false;
                }
            }
        }

        return true;

    }

}
