package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaxDifferenceEvenOddFrequencyI {

    MaxDifferenceEvenOddFrequencyI solution = new MaxDifferenceEvenOddFrequencyI();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int expected) {
        assertThat(solution.maxDifference(s)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("aabb", -1),
                Arguments.of("aabbc", 1),
                Arguments.of("abcde", 0),
                Arguments.of("aaaabbbbccdde", 1),
                Arguments.of("aabbccddeeffg", 1),
                Arguments.of("zzzyyyxxxww", 1),
                Arguments.of("aabbccdd", -1)
        );
    }
}
