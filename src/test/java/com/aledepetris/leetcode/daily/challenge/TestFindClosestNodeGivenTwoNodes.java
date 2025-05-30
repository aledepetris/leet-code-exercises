package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestFindClosestNodeGivenTwoNodes {

    FindClosestNodeGivenTwoNodes solution = new FindClosestNodeGivenTwoNodes();

    @ParameterizedTest
    @MethodSource("testCases")
    void testClosestMeetingNode(int[] edges, int node1, int node2, int expected) {
        assertThat(solution.closestMeetingNode(edges, node1, node2)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, -1}, 0, 1, 2),
                Arguments.of(new int[]{1, 2, -1}, 0, 2, 2),
                Arguments.of(new int[]{1, 2, 0}, 0, 2, 0),
                Arguments.of(new int[]{-1, 0}, 0, 1, 0),
                Arguments.of(new int[]{1, 2, -1}, 1, 1, 1),
                Arguments.of(new int[]{1, 2, -1, 4, -1}, 0, 3, -1)
        );
    }
}

