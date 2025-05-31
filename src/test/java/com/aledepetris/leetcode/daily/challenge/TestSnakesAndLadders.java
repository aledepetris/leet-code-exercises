package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestSnakesAndLadders {

    SnakesAndLadders solution = new SnakesAndLadders();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[][] board, int expected) {
        assertThat(solution.snakesAndLadders(board)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {-1, -1, -1},
                        {-1, -1, -1},
                        {-1, -1, -1}
                }, 2),

                Arguments.of(new int[][]{
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, 35, -1, -1, 13, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, 15, -1, -1, -1, -1}
                }, 4),

                Arguments.of(new int[][]{
                        {-1, -1, -1},
                        {-1, -1, -1},
                        {-1, 8, -1}
                }, 2),

                Arguments.of(new int[][]{
                        {-1, -1, -1},
                        {-1, -1, -1},
                        {-1, -1, 1}
                }, 2)
        );
    }
}
