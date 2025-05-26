package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLargestColorValueDirectedGraph {

    LargestColorValueDirectedGraph solution = new LargestColorValueDirectedGraph();

    @ParameterizedTest(name = "{index} => colors={0}, edges={1}, expected={2}")
    @MethodSource("testData")
    @DisplayName("Parameterized test for largestPathValue")
    void test(String colors, int[][] edges, int expected) {
        assertEquals(expected, solution.largestPathValue(colors, edges));
    }

    static Stream<Arguments> testData() {
        return Stream.of(Arguments.of("abaca",
                        new int[][]{{0,1},{0,2},{2,3},{3,4}},
                        3
                ), Arguments.of(
                        "a",
                        new int[][]{{0,0}},
                        -1
                ), Arguments.of(
                        "abc",
                        new int[][]{{0,1}, {1,2}},
                        1
                ), Arguments.of(
                        "aaaa",
                        new int[][]{{0,1}, {1,2}, {2,3}},
                        4
                ), Arguments.of(
                        "ab",
                        new int[][]{},
                        1
                )
        );
    }
}
