package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestMaxNumTargetNodesConnectingTreesI {

    MaxNumTargetNodesConnectingTreesI solution = new MaxNumTargetNodesConnectingTreesI();

    @ParameterizedTest
    @MethodSource("testCases")
    void testMaxTargetNodes(int[][] edges1, int[][] edges2, int k, int[] expected) {
        assertThat(solution.maxTargetNodes(edges1, edges2, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{0,1},{0,2},{2,3},{2,4}},
                        new int[][]{{0,1},{0,2},{0,3},{2,7},{1,4},{4,5},{4,6}},
                        2,
                        new int[]{9,7,9,8,8}),

                Arguments.of(
                        new int[][]{{0,1},{0,2},{0,3},{0,4}},
                        new int[][]{{0,1},{1,2},{2,3}},
                        1,
                        new int[]{6,3,3,3,3})
        );
    }
}


