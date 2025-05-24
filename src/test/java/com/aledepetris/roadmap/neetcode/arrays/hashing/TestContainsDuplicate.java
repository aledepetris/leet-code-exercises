package com.aledepetris.roadmap.neetcode.arrays.hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestContainsDuplicate {

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, boolean expected) {
        assertThat(containsDuplicate.hasDuplicate(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{1, 1, 1, 1}, true),
                Arguments.of(new int[]{}, false),
                Arguments.of(new int[]{0}, false),
                Arguments.of(new int[]{5, 6, 7, 5}, true),
                Arguments.of(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, false)
        );
    }
}
