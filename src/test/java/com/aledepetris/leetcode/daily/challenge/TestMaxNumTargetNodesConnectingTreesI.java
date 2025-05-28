package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestMaxNumTargetNodesConnectingTreesI {

    MaxNumTargetNodesConnectingTreesI solution = new MaxNumTargetNodesConnectingTreesI();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[][] edges1, int[][] edges2, int k, int[] expected) {
        assertThat(solution.maxTargetNodes(edges1, edges2, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{0, 1}, {1, 2}, {1, 3}},
                        new int[][]{{0, 1}, {1, 2}},
                        2,
                        new int[]{5, 5, 4, 4}
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {1, 2}},
                        new int[][]{{0, 1}},
                        1,
                        new int[]{3, 3, 2}
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {1, 2}, {2, 3}},
                        new int[][]{{0, 1}, {1, 2}, {2, 3}},
                        3,
                        new int[]{7, 7, 7, 7}
                )
        );
    }
}

