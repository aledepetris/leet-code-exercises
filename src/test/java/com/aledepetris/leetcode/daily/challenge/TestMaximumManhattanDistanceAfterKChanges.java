package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestMaximumManhattanDistanceAfterKChanges {
    MaximumManhattanDistanceAfterKChanges solution = new MaximumManhattanDistanceAfterKChanges();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, int k, int expected) {
        assertThat(solution.maxDistance(s, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("NWSE", 1, 3),
                Arguments.of("NSWWEW", 3,6 )
        );
    }
}
