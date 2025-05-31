package com.aledepetris.roadmap.algomaster.bit.manipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestCountingBits {

    CountingBits solution = new CountingBits();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int[] expected) {
        assertThat(solution.countBits(n)).isEqualTo(expected);
        assertThat(solution.countBits2(n)).isEqualTo(expected);

    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(0, new int[]{0}),
                Arguments.of(1, new int[]{0, 1}),
                Arguments.of(2, new int[]{0, 1, 1}),
                Arguments.of(3, new int[]{0, 1, 1, 2}),
                Arguments.of(4, new int[]{0, 1, 1, 2, 1}),
                Arguments.of(5, new int[]{0, 1, 1, 2, 1, 2}),
                Arguments.of(7, new int[]{0, 1, 1, 2, 1, 2, 2, 3}),
                Arguments.of(8, new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}),
                Arguments.of(15, new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4}),
                Arguments.of(16, new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1})
        );
    }
}