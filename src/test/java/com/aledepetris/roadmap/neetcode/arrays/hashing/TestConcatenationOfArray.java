package com.aledepetris.roadmap.neetcode.arrays.hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestConcatenationOfArray {

    ConcatenationOfArray concat = new ConcatenationOfArray();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int[] expected) {
        assertThat(concat.getConcatenation(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                Arguments.of(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{5}, new int[]{5, 5}),
                Arguments.of(new int[]{0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0})
        );
    }
}

