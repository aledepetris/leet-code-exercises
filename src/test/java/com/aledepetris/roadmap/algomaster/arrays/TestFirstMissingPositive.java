package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.Arguments;

class TestFirstMissingPositive {

    FirstMissingPositive solution = new FirstMissingPositive();

    @ParameterizedTest(name = "{index} => nums={0}, expected={1}")
    @MethodSource("testData")
    @DisplayName("Parameterized test for firstMissingPositive")
    void test(int[] nums, int expected) {
        assertEquals(expected, solution.firstMissingPositive(nums));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 0}, 3),
                Arguments.of(new int[]{3, 4, -1, 1}, 2),
                Arguments.of(new int[]{7, 8, 9, 11, 12}, 1),
                Arguments.of(new int[]{1, 2, 3}, 4),
                Arguments.of(new int[]{2, 1}, 3),
                Arguments.of(new int[]{}, 1),
                Arguments.of(new int[]{-5, -3, -2}, 1)
        );
    }
}
