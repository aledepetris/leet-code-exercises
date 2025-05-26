package com.aledepetris.roadmap.algomaster.strings;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseS = new StringBuilder(s).reverse().toString();
        return s.equals(reverseS);
    }
}
