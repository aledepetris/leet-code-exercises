package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMinimizeTheMaximumDifferenceOfPairs {

    MinimizeTheMaximumDifferenceOfPairs solution = new MinimizeTheMaximumDifferenceOfPairs();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int p, int expected) {
        assertThat(solution.minimizeMax(nums, p)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{10,1,2,7,1,3}, 2, 1),
                Arguments.of(new int[]{4,2,1,2}, 1, 0),
                Arguments.of(new int[]{1,1,1,1}, 2, 0)
        );
    }
}
