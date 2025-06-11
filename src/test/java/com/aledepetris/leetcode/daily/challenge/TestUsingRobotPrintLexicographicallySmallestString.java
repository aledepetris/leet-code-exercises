package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestUsingRobotPrintLexicographicallySmallestString {

    UsingRobotPrintLexicographicallySmallestString solution = new UsingRobotPrintLexicographicallySmallestString();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, String expected) {
        assertThat(solution.robotWithString(s)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("zza", "azz"),
                Arguments.of("bac", "abc"),
                Arguments.of("bdda", "addb"),
                Arguments.of("a", "a"),
                Arguments.of("z", "z"),
                Arguments.of("abc", "abc"),
                Arguments.of("abcd", "abcd"),
                Arguments.of("dcba", "abcd"),
                Arguments.of("cba", "abc"),
                Arguments.of("aaa", "aaa"),
                Arguments.of("zzz", "zzz"),
                Arguments.of("cab", "abc"),
                Arguments.of("acb", "abc"),
                Arguments.of("bacd", "abcd"),
                Arguments.of("abba", "aabb"),
                Arguments.of("abab", "aabb"),
                Arguments.of("baba", "aabb"),
                Arguments.of("dacb", "abcd")
        );
    }
}