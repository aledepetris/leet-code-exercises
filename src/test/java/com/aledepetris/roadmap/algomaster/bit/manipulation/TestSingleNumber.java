package com.aledepetris.roadmap.algomaster.bit.manipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestSingleNumber {

    SingleNumber solution = new SingleNumber();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int expected) {
        assertThat(solution.singleNumber(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{0, 1, 0}, 1),
                Arguments.of(new int[]{-1, -1, 2}, 2),
                Arguments.of(new int[]{3, 3, 7, 7, 10, 11, 11}, 10),
                Arguments.of(new int[]{5, 7, 5, 4, 7}, 4),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{-4, 1, -4, -5, 1}, -5)
        );
    }
}