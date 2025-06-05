package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestLexicographicallySmallestEquivalentString {

    LexicographicallySmallestEquivalentString solution = new LexicographicallySmallestEquivalentString();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s1, String s2, String baseStr, String expected) {
        assertThat(solution.smallestEquivalentString(s1, s2, baseStr)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("parker", "morris", "parser", "makkek"),
                Arguments.of("hello", "world", "hold", "hdld"),
                Arguments.of("leetcode", "programs", "sourcecode", "aauaaaaada"),
                Arguments.of("ab", "ba", "a", "a"),
                Arguments.of("ab", "ba", "b", "a"),
                Arguments.of("abc", "bcd", "abcd", "aaaa"),
                Arguments.of("ab", "cd", "abcd", "abab"),
                Arguments.of("aa", "bb", "ab", "aa"),
                Arguments.of("a", "b", "a", "a"),
                Arguments.of("a", "b", "b", "a"),
                Arguments.of("z", "a", "z", "a"),
                Arguments.of("ab", "cd", "ef", "ef"),
                Arguments.of("abcd", "efgh", "abcdefgh", "aaaaaaaa"),
                Arguments.of("ace", "bdf", "abcdef", "aaabaa"),
                Arguments.of("zyxw", "abcd", "zyxw", "dddd"),
                Arguments.of("bcdefghijklmnopqrstuvwxyz", "acdefghijklmnopqrstuvwxyza", "z", "a"),
                Arguments.of("ab", "ba", "", ""),
                Arguments.of("ab", "ba", "c", "c")
        );
    }
}