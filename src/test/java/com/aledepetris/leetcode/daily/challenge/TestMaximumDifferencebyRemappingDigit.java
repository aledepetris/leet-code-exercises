package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaximumDifferenceByRemappingADigit {

    @ParameterizedTest
    @MethodSource("testData")
    void test(int num, int expected) {
        MaximumDifferenceByRemappingDigit solution = new MaximumDifferenceByRemappingDigit();
        assertThat(solution.minMaxDifference(num))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(11891, 99009),
                Arguments.of(90, 99),
                Arguments.of(111, 999),
                Arguments.of(9, 9),
                Arguments.of(1000, 9000)
        );
    }
}
