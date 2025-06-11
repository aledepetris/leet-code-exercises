package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestLexicographicallyMinStringAfterRemovingStars {

    LexicographicallyMinStringAfterRemovingStars solution = new LexicographicallyMinStringAfterRemovingStars();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, String expected) {
        assertThat(solution.clearStars(s)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("erase*****", ""),
                Arguments.of("a*b*c*", ""),
                Arguments.of("abc", "abc"),
                Arguments.of("a*", ""),
                Arguments.of("ba*c", "bc"),
                Arguments.of("dcba****", ""),
                Arguments.of("zyxabc***", "zyx"),
                Arguments.of("abcdef******", ""),
                Arguments.of("single", "single"),
                Arguments.of("a*b*c*d*e*", ""),
                Arguments.of("hello***world", "loworld")
        );
    }
}