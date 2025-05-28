package com.aledepetris.roadmap.algomaster.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ZigzagConversionTest {

    ZigzagConversion solution = new ZigzagConversion();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String input, int numRows, String expected) {
        assertThat(solution.convert(input, numRows)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("A", 1, "A"),
                Arguments.of("AB", 1, "AB"),
                Arguments.of("ABCD", 2, "ACBD"),
                Arguments.of("ABCDE", 3, "AEBDC"),
                Arguments.of("", 1, ""),
                Arguments.of("ABC", 5, "ABC") // numRows > length
        );
    }
}
