package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestMaxDifferenceYouCanGetFromChangingAnInteger {

    MaxDifferenceYouCanGetFromChangingInteger solution = new MaxDifferenceYouCanGetFromChangingInteger();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int num, int expected) {
        assertThat(solution.maxDiff(num)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(555, 888),
                Arguments.of(9, 8),
                Arguments.of(123456, 820000),
                Arguments.of(10000, 80000),
                Arguments.of(9288, 8700),
                Arguments.of(1101057, 8808050)
        );
    }
}
