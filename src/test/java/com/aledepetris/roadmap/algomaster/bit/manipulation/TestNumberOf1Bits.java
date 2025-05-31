package com.aledepetris.roadmap.algomaster.bit.manipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestNumberOf1Bits {

    NumberOf1Bits solution = new NumberOf1Bits();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int expected) {
        assertThat(solution.hammingWeight(n)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(11, 3),      // 1011 in binary
                Arguments.of(128, 1),     // 10000000 in binary
                Arguments.of(0, 0),       // 0 in binary
                Arguments.of(1, 1),       // 1 in binary
                Arguments.of(7, 3),       // 111 in binary
                Arguments.of(15, 4),      // 1111 in binary
                Arguments.of(16, 1),      // 10000 in binary
                Arguments.of(255, 8),     // 11111111 in binary
                Arguments.of(-3, 31),     // 11111101 (in 32-bit two's complement)
                Arguments.of(Integer.MAX_VALUE, 31),  // 01111111111111111111111111111111
                Arguments.of(-1, 32)      // 11111111111111111111111111111111
        );
    }
}