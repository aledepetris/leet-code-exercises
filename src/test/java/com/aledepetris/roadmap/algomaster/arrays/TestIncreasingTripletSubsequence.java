package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestIncreasingTripletSubsequence {

    IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

    @ParameterizedTest(name = "{index} => nums={0}, expected={1}")
    @MethodSource("testData")
    @DisplayName("Test for increasingTriplet")
    void testIncreasingTriplet(int[] nums, boolean expected) {
        assertEquals(expected, solution.increasingTriplet(nums));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, true),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, false),
                Arguments.of(new int[]{2, 1, 5, 0, 4, 6}, true),
                Arguments.of(new int[]{1, 2}, false),
                Arguments.of(new int[]{2, 4, -2, -3}, false),
                Arguments.of(new int[]{1, 1, 1, 1}, false),
                Arguments.of(new int[]{20, 100, 10, 12, 5, 13}, true)
        );
    }
}

