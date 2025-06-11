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
                Arguments.of("12233", 4, -1),
                Arguments.of("1122211", 3, 1),
                Arguments.of("110", 3, -1),
                Arguments.of("000111222", 3, 1)
        );
    }
}
