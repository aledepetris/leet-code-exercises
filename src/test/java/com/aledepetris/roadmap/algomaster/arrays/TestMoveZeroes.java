package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMoveZeroes {

    MoveZeroes moveZeroes = new MoveZeroes();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int[] expected) {
        moveZeroes.moveZeroes(input);
        assertThat(input).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0, 0, 1}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{1, 0}, new int[]{1, 0}),
                Arguments.of(new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{4, 0, 5, 0, 6}, new int[]{4, 5, 6, 0, 0}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }
}
