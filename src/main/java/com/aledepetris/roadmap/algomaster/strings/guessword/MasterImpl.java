package com.aledepetris.roadmap.algomaster.strings.guessword;

public class MasterImpl implements Master {

    private final String secret;
    private int attempts = 0;

    public MasterImpl(String secret) {
        this.secret = secret;
    }
    
    @Override
    public int guess(String word) {
        attempts++;
        int matches = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == secret.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }

    public int getAttempts() {
        return attempts;
    }
}
