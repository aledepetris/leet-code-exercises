package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashMap;
import java.util.Map;

/**
 * 1189. Maximum Number of Balloons - Given a string text, you want to use the characters of text to form as
 * many instances of the word "balloon" as possible. You can use each character in text at most once. Return the
 * maximum number of instances that can be formed.
 */
public class Balloons {

    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> letters = new HashMap<>();
        for (char c : text.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        int count = letters.getOrDefault('b', 0);
        if (count == 0) return 0;

        letters.computeIfPresent('l', (k,v) -> v / 2);
        letters.computeIfPresent('o', (k,v) -> v / 2);

        for (char c : "alon".toCharArray()) {
            count = Math.min(count, letters.getOrDefault(c, 0));
        }

        return count;

    }

}
