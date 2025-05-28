package com.aledepetris.roadmap.algomaster.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestReverseWordsInString {

    ReverseWordsInString solution = new ReverseWordsInString(); // Reemplazá por el nombre real de tu clase

    @ParameterizedTest
    @MethodSource("testData")
    void test(String input, String expected) {
        assertThat(solution.reverseWords(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a"),
                Arguments.of("  Bob    Loves  Alice   ", "Alice Loves Bob"),
                Arguments.of("Alice does not even like bob", "bob like even not does Alice"),
                Arguments.of("", ""),
                Arguments.of("    ", "")
        );
    }
}