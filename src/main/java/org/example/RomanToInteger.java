package org.example;

import java.util.Map;

/**
 * 13. Roman to Integer
 * oman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is
 * simply X + II. The number 27 is written as XXVII, which is XX + V + II.Roman numerals are usually written largest
 * to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four. The same principle applies to the number nine,
 * which is written as IX. There are six instances where subtraction is used:
 *  - I can be placed before V (5) and X (10) to make 4 and 9.
 *  - X can be placed before L (50) and C (100) to make 40 and 90.
 *  - C can be placed before D (500) and M (1000) to make 400 and 900.
 *  - Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {

    private static final Map<Character, Integer> romanNumberMap = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
    );

    public int romanToInt(String roman) {
        int integerNumber = 0;

        for (int i = roman.length()-1; i >= 0; i--) {
            char letter = roman.charAt(i);
            if (letter == ('V') || letter == ('X')) {
                if (i != 0 && roman.charAt(i-1) == 'I') {
                    integerNumber += (romanNumberMap.get(letter) - romanNumberMap.get(roman.charAt(i-1)));
                    i--;
                } else {
                    integerNumber += romanNumberMap.get(letter);
                }
            } else if ( letter == ('L') || letter == ('C')) {
                if (i != 0 && roman.charAt(i-1) == 'X') {
                    integerNumber += (romanNumberMap.get(letter) - romanNumberMap.get(roman.charAt(i-1)));
                    i--;
                } else {
                    integerNumber += romanNumberMap.get(letter);
                }
            } else if ( letter == ('D') || letter == ('M')) {
                if (i != 0 && roman.charAt(i-1) == 'C') {
                    integerNumber += (romanNumberMap.get(letter) - romanNumberMap.get(roman.charAt(i-1)));
                    i--;
                } else {
                    integerNumber += romanNumberMap.get(letter);
                }
            } else {
                integerNumber += romanNumberMap.get(letter);
            }

        }
        return integerNumber;
    }

}
