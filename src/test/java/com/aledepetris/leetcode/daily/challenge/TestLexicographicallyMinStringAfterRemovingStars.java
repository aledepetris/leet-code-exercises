package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestLexicographicallyMinStringAfterRemovingStars {

    LexicographicallyMinStringAfterRemovingStars solution = new LexicographicallyMinStringAfterRemovingStars();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String s, String expected) {
        assertThat(solution.clearStars(s)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("leet**cod*e", "lecoe"),
                Arguments.of("erase*****", ""),
                Arguments.of("abc*def*", "abef"),
                Arguments.of("a*b*c*", ""),
                Arguments.of("abc", "abc"),
                Arguments.of("a*", ""),
                Arguments.of("*a", "*a"),
                Arguments.of("ba*c", "bc"),
                Arguments.of("dcba****", ""),
                Arguments.of("hello*world*", "heloword"),
                Arguments.of("zyx*wvu*tsr*", "zyxwutsr"),
                Arguments.of("abcd*efgh*", "abcdefgh"),
                Arguments.of("programming*contest*", "programmincontest"),
                Arguments.of("aabbcc***", "abc"),
                Arguments.of("zyxabc***", "zyx"),
                Arguments.of("test*case*", "tecase"),
                Arguments.of("aaa*bbb*ccc*", "aabcc"),
                Arguments.of("x*y*z*", ""),
                Arguments.of("leetcode****", "code"),
                Arguments.of("abcdef******", ""),
                Arguments.of("single", "single"),
                Arguments.of("a*b*c*d*e*", ""),
                Arguments.of("hello***world", "loworld")
        );
    }
}