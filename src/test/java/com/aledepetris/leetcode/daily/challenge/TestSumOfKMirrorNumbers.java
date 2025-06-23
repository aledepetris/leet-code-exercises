package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestSumOfKMirrorNumbers {
    SumOfKMirrorNumbers solution = new SumOfKMirrorNumbers();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int k, int n, int expected) {
        assertThat(solution.kMirror(k, n)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(2, 5, 25),
                Arguments.of(3, 7, 499),
                Arguments.of(7, 17, 20379000)
        );
    }
}
