package com.aledepetris.roadmap.neetcode.arrays.hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestValidAnagram {

    ValidAnagram validAnagram = new ValidAnagram();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, String t, boolean expected) {
        assertThat(validAnagram.isAnagram(s, t)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("", "", true),
                Arguments.of("a", "a", true),
                Arguments.of("ab", "ba", true),
                Arguments.of("abc", "abcd", false),
                Arguments.of("listen", "silent", true),
                Arguments.of("hello", "bello", false)
        );
    }
}
