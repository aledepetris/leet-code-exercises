package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaxDifferenceEvenOddFrequencyII {

    MaxDifferenceEvenOddFrequencyII solution = new MaxDifferenceEvenOddFrequencyII();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int k, int expected) {
        assertThat(solution.maxDifference(s, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("012012", 2, 2),
                Arguments.of("0123401234", 3, 2),
                Arguments.of("000111222333444", 5, 2),
                Arguments.of("01234", 1, 1),
                Arguments.of("00000", 2, Integer.MIN_VALUE),
                Arguments.of("1234012340", 4, 2),
                Arguments.of("011223344", 3, 2)
        );
    }
}