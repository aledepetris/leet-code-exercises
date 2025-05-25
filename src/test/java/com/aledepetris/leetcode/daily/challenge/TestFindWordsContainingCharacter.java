package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestFindWordsContainingCharacter {

    FindWordsContainingCharacter solution = new FindWordsContainingCharacter(); // ← cambia aquí

    @ParameterizedTest
    @MethodSource("testData")
    void test(String[] words, char x, List<Integer> expected) {
        assertThat(solution.findWordsContaining(words, x))
                .containsExactlyInAnyOrder(expected.toArray(new Integer[0]));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"leet", "code"}, 'e', List.of(0, 1)),
                Arguments.of(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a', List.of(0, 2)),
                Arguments.of(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z', List.of()),
                Arguments.of(new String[]{}, 'x', List.of()),
                Arguments.of(new String[]{"xyz"}, 'x', List.of(0)),
                Arguments.of(new String[]{"xyz"}, 'y', List.of(0)),
                Arguments.of(new String[]{"xyz"}, 'z', List.of(0)),
                Arguments.of(new String[]{"xyz"}, 'a', List.of())
        );
    }
}
