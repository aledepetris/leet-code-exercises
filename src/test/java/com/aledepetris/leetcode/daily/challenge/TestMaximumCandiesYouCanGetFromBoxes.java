package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaximumCandiesYouCanGetFromBoxes {

    MaximumCandiesYouCanGetFromBoxes solution = new MaximumCandiesYouCanGetFromBoxes();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes, int expected) {
        assertThat(solution.maxCandies(status, candies, keys, containedBoxes, initialBoxes)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 0, 1, 0},
                        new int[]{7, 5, 4, 9},
                        new int[][]{{}, {}, {1}, {2}},
                        new int[][]{{1, 2}, {3}, {}, {}},
                        new int[]{0},
                        16
                ),
                Arguments.of(
                        new int[]{1, 0, 0},
                        new int[]{5, 10, 15},
                        new int[][]{{}, {2}, {1}},
                        new int[][]{{}, {}, {}},
                        new int[]{0},
                        5
                ),
                Arguments.of(
                        new int[]{1, 1, 1},
                        new int[]{10, 20, 30},
                        new int[][]{{}, {}, {}},
                        new int[][]{{}, {}, {}},
                        new int[]{},
                        0
                )
        );
    }
}