package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestLongestPalindromeBy2LetterWords {

    LongestPalindromeBy2LetterWords solution = new LongestPalindromeBy2LetterWords();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String[] words, int expected) {
        assertThat(solution.longestPalindrome(words)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"lc","cl","gg"}, 6),
                Arguments.of(new String[]{"ab","ty","yt","lc","cl","ab"}, 8),
                Arguments.of(new String[]{"cc","ll","xx"}, 2),
                Arguments.of(new String[]{"aa","aa","aa"}, 6),
                Arguments.of(new String[]{"ab","ba","cd","dc","ee"}, 10),
                Arguments.of(new String[]{"ab","cd","ef"}, 0),
                Arguments.of(new String[]{"aa"}, 2),
                Arguments.of(new String[]{"aa", "bb", "cc", "aa"}, 6),
                Arguments.of(new String[]{}, 0)
        );
    }
}

