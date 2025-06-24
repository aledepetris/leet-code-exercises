package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestFindAllKDistantIndicesInArray {

    FindAllKDistantIndicesInArray solution = new FindAllKDistantIndicesInArray();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[]nums, int key, int k, int expected) {
        assertThat(solution.findKDistantIndices(nums, key, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1, new int[]{1,2,3,4,5,6}),
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 2, 2, new int[]{0,1,2,3,4})
        );
    }

}
