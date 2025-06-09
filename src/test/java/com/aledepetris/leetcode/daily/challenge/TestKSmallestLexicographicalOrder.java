package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestKSmallestLexicographicalOrder {

    KSmallestLexicographicalOrder solution = new KSmallestLexicographicalOrder();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int k, int expected) {
        assertThat(solution.findKthNumber(n, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(13, 2, 10),
                Arguments.of(1, 1, 1),
                Arguments.of(100, 10, 17),
                Arguments.of(1000, 100, 117),
                Arguments.of(1000000000, 1, 1),
                Arguments.of(681692778, 351251360, 416126219)
        );
    }
}
