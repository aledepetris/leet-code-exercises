package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestCandy {

    Candy solution = new Candy();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] ratings, int expected) {
        assertThat(solution.candy(ratings)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 2}, 5),           // Example 1: valley pattern
                Arguments.of(new int[]{1, 2, 2}, 4),           // Example 2: plateau
                Arguments.of(new int[]{1}, 1),                 // Single child
                Arguments.of(new int[]{1, 2}, 3),              // Increasing pair
                Arguments.of(new int[]{2, 1}, 3),              // Decreasing pair
                Arguments.of(new int[]{1, 2, 3}, 6),           // Strictly increasing
                Arguments.of(new int[]{3, 2, 1}, 6),           // Strictly decreasing
                Arguments.of(new int[]{1, 3, 2, 2, 1}, 7),     // Mountain with plateau
                Arguments.of(new int[]{1, 2, 87, 87, 87, 2, 1}, 13), // Large plateau
                Arguments.of(new int[]{1, 3, 4, 5, 2}, 11),    // Mountain pattern
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 5),     // All equal ratings
                Arguments.of(new int[]{1, 6, 10, 8, 7, 3, 2}, 18) // Complex pattern
        );
    }
}
