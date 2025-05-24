package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestZeroFilledSubarrays {

    ZeroFilledSubarrays solution = new ZeroFilledSubarrays();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, long expected) {
        assertThat(solution.zeroFilledSubarray(nums)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 0, 0, 2, 0, 0, 4}, 6),
                Arguments.of(new int[]{0, 0, 0, 2, 0, 0}, 9),
                Arguments.of(new int[]{0, 0, 0, 0}, 10),
                Arguments.of(new int[]{1, 2, 3}, 0),
                Arguments.of(new int[]{0}, 1),
                Arguments.of(new int[]{}, 0)
        );
    }
}

