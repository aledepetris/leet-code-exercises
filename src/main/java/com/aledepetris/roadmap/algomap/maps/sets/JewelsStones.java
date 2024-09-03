package com.aledepetris.roadmap.algomap.maps.sets;

import java.util.HashMap;
import java.util.Map;

/**
 * 771. Jewels and Stones.
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you
 * have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are
 * also jewels. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsStones {

    public int numJewelsInStones(String jewels, String stones) {

        Map<Character, Integer> myJewels = new HashMap<>();

        for (char j: jewels.toCharArray()) {
            myJewels.putIfAbsent(j, 0);
        }

        for (char s: stones.toCharArray()) {
            myJewels.computeIfPresent(s, (k,v) -> v + 1);
        }

        int total = 0;
        for (int value: myJewels.values()) {
            total += value;
        }
        return total;

    }

}
