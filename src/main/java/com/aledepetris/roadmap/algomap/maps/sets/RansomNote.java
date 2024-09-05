package com.aledepetris.roadmap.algomap.maps.sets;

/**
 * 338. Ransom Note - Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using
 * the letters from magazine and false otherwise.Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if ( index == -1) {
                return false;
            } else {
                magazine = magazine.substring(0, index) + magazine.substring(index + 1);
            }
        }
        return true;
    }

}
