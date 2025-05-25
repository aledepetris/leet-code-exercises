package com.aledepetris.leetcode.daily.challenge;

import java.util.LinkedList;
import java.util.List;

public class FindWordsContainingCharacter {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                ans.add(i);
            }
        }
        return ans;
    }

}
