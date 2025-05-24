package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestProductOfArrayExceptSelf {

    ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int[] expected) {
        assertThat(solver.productExceptSelf(nums)).containsExactly(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
                Arguments.of(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0}),
                Arguments.of(new int[]{2, 3, 4, 5}, new int[]{60, 40, 30, 24}),
                Arguments.of(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}),
                Arguments.of(new int[]{10}, new int[]{1})
        );
    }
}

