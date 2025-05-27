package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestDivisibleNonDivisibleSumsDifference {

    DivisibleNonDivisibleSumsDifference solution = new DivisibleNonDivisibleSumsDifference();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int m, int expected) {
        assertThat(solution.differenceOfSums(n, m)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(10, 3, 19),
                Arguments.of(5, 2, 3),
                Arguments.of(6, 6, 9),
                Arguments.of(1, 1, -1),
                Arguments.of(1, 2, 1)
        );
    }
}
