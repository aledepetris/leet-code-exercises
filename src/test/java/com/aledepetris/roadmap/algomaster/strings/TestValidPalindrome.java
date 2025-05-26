package com.aledepetris.roadmap.algomaster.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestValidPalindrome {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @ParameterizedTest
    @MethodSource("testData")
    void testIsPalindrome(String input, boolean expectedOutput) {
        boolean result = validPalindrome.isPalindrome(input);
        assertThat(result).isEqualTo(expectedOutput);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true),
                Arguments.of("Madam", true),
                Arguments.of("No 'x' in Nixon", true),
                Arguments.of("12321", true),
                Arguments.of("123456", false),
                Arguments.of("!@#", true)
        );
    }

}
