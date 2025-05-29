package com.aledepetris.roadmap.algomaster.strings.guessword;

import java.util.*;

public class GuessTheWord {

    public void findSecretWord(String[] words, Master master) {
        int matches = 0;
        for (int i = 0; i < 30 && matches != 6; i++) {
            String guess = chooseBestGuess(words);
            matches = master.guess(guess);
            List<String> candidates = new ArrayList<>();
            for (String word : words) {
                if (matches == getMatches(guess, word)) {
                    candidates.add(word);
                }
            }
            words = candidates.toArray(new String[0]);
        }
    }

    private String chooseBestGuess(String[] words) {
        int minMaxGroupSize = Integer.MAX_VALUE;
        String bestWord = words[0];

        for (String word1 : words) {
            Map<Integer, Integer> matchGroups = new HashMap<>();
            for (String word2 : words) {
                if (word1.equals(word2))
                    continue;
                int matches = getMatches(word1, word2);
                matchGroups.put(matches, matchGroups.getOrDefault(matches, 0) + 1);
            }

            int worstCaseGroupSize = matchGroups.values()
                    .stream()
                    .max(Integer::compare)
                    .orElse(0);

            if (worstCaseGroupSize < minMaxGroupSize) {
                minMaxGroupSize = worstCaseGroupSize;
                bestWord = word1;
            }
        }

        return bestWord;
    }

    private int getMatches(String word1, String word2) {
        int matches = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }

}

