package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaxNumTargetNodesConnectingTreesII {

     MaxNumTargetNodesConnectingTreesII solution = new MaxNumTargetNodesConnectingTreesII();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[][] edges1, int[][] edges2, int[] expected) {
        assertThat(solution.maxTargetNodes(edges1, edges2)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{0,1},{0,2},{2,3},{2,4}},
                        new int[][]{{0,1},{0,2},{0,3},{2,7},{1,4},{4,5},{4,6}},
                        new int[]{8, 7, 7, 8, 8}
                ),
                Arguments.of(
                        new int[][]{{0,1},{0,2},{0,3},{0,4}},
                        new int[][]{{0,1},{1,2},{2,3}},
                        new int[]{3, 6, 6, 6, 6}
                )
        );
    }
}
