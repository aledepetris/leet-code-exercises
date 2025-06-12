package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaximumDifferenceBetweenAdjacentElementsInACircularArray {

    MaximumDifferenceBetweenAdjacentElementsInACircularArray solution =
            new MaximumDifferenceBetweenAdjacentElementsInACircularArray();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int expected) {
        assertThat(solution.maxAdjacentDistance(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{10, 3, 5, 1}, 9),
                Arguments.of(new int[]{-2, -8, 4, 1}, 12),
                Arguments.of(new int[]{7, 7, 7, 7}, 0),
                Arguments.of(new int[]{5, -5}, 10),
                Arguments.of(new int[]{6, 1, 12, 3, 8}, 11)
        );
    }
}
