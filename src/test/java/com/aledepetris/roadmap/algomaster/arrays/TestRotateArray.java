package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestRotateArray {

    RotateArray rotateArray = new RotateArray();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int k, int[] expected) {
        rotateArray.rotate(input, k);
        assertThat(input).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}),
                Arguments.of(new int[]{1}, 0, new int[]{1}),
                Arguments.of(new int[]{1, 2}, 3, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2, 3}, 3, new int[]{1, 2, 3})
        );
    }
}
