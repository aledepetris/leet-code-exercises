package com.aledepetris.roadmap.algomaster.strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.provider.Arguments;

class TestLongestCommonPrefix {
    LongestCommonPrefix solution = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String[] input, String expected) {
        assertThat(solution.longestCommonPrefix(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"interspecies", "interstellar", "interstate"}, "inters"),
                Arguments.of(new String[]{"throne", "throne"}, "throne"),
                Arguments.of(new String[]{"a"}, "a"),
                Arguments.of(new String[]{"", "b"}, ""),
                Arguments.of(new String[]{}, "")
        );
    }
}
