package com.aledepetris.leetcode.daily.challenge;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
class TestFindLexicographicalyLargesStringBoxI {

    FindLexicographicalyLargesStringBoxI solution = new FindLexicographicalyLargesStringBoxI();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String word, int numFriends, String expected) {
        assertThat(solution.answerString(word, numFriends)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("hello", 1, "hello"),
                Arguments.of("abc", 1, "abc"),
                Arguments.of("z", 1, "z"),
                Arguments.of("dbca", 2, "dbc"),
                Arguments.of("gggg", 4, "g"),
                Arguments.of("abcd", 3, "d"),
                Arguments.of("azbycx", 3, "zbyc"),
                Arguments.of("xyz", 2, "z"),
                Arguments.of("zab", 2, "za"),
                Arguments.of("aaaa", 2, "aaa"),
                Arguments.of("bbbb", 3, "bb"),
                Arguments.of("abc", 3, "c"),
                Arguments.of("zyx", 3, "z"),
                Arguments.of("zyxw", 2, "zyx"),
                Arguments.of("fedcba", 3, "fedc"),
                Arguments.of("abcz", 2, "z"),
                Arguments.of("x", 1, "x")
        );
    }

}
