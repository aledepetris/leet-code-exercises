package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestRemoveDuplicatesFromSortedArray {

    RemoveDuplicatesFromSortedArray remover = new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int expectedLength, int[] expectedArray) {
        int resultLength = remover.removeDuplicates(input);
        assertThat(resultLength).isEqualTo(expectedLength);
        assertThat(trimmedCopy(input, resultLength)).isEqualTo(expectedArray);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4}),
                Arguments.of(new int[]{1, 2}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{1, 1, 1, 1}, 1, new int[]{1}),
                Arguments.of(new int[]{}, 0, new int[]{}),
                Arguments.of(new int[]{1}, 1, new int[]{1})
        );
    }

    private static int[] trimmedCopy(int[] arr, int length) {
        int[] trimmed = new int[length];
        System.arraycopy(arr, 0, trimmed, 0, length);
        return trimmed;
    }
}