package com.aledepetris.roadmap.neetcode.arrays.hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTopKFrequentElements {

    TopKFrequentElements topK = new TopKFrequentElements();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int k, int[] expected) {
        assertThat(topK.topKFrequent(input, k)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,2,2,3}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{4,4,4,6,6,5,5,5}, 2, new int[]{4, 5}), // 4 and 5 have freq 3, 6 freq 2
                Arguments.of(new int[]{1,2,3,4,5}, 3, new int[]{1,2,3}), // todos con freq 1, cualquiera de los 3 primeros está bien
                Arguments.of(new int[]{}, 0, new int[]{}),
                Arguments.of(new int[]{2,2,3,3,4,4,4,5,5,5,5}, 2, new int[]{5,4})
        );
    }
}
