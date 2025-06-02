package com.aledepetris.leetcode.daily.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestDistributeCandiesAmongChildrenII {

    DistributeCandiesAmongChildrenII solution = new DistributeCandiesAmongChildrenII();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int limit, long expected) {
        assertThat(solution.distributeCandies(n, limit)).isEqualTo(expected);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(5, 2, 3L),      // Example 1 from LeetCode
                Arguments.of(3, 3, 10L),     // Example 2 from LeetCode
                Arguments.of(1, 1, 3L),      // Small case: 1 candy, limit 1
                Arguments.of(2, 1, 3L),      // 2 candies, limit 1
                Arguments.of(4, 2, 6L),      // 4 candies, limit 2
                Arguments.of(6, 3, 10L),     // 6 candies, limit 3
                Arguments.of(0, 1, 1L),      // Edge case: 0 candies
                Arguments.of(1, 5, 3L),      // Limit much larger than candies
                Arguments.of(10, 5, 21L),    // Larger case
                Arguments.of(8, 4, 15L)      // 8 candies, limit 4
        );
    }
}