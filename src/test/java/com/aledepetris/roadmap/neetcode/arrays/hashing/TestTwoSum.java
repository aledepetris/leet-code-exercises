package com.aledepetris.roadmap.neetcode.arrays.hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTwoSum {

    TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int target, int[] expected) {
        int[] result = twoSum.twoSum(nums, target);

        // Como el orden puede importar (depende de la implementación), validamos ambos órdenes posibles
        assertThat(result.length).isEqualTo(2);
        boolean matchDirect = (result[0] == expected[0] && result[1] == expected[1]);
        boolean matchSwapped = (result[0] == expected[1] && result[1] == expected[0]);
        assertThat(matchDirect || matchSwapped).isTrue();
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1}),
                Arguments.of(new int[]{1,2,3,4,5}, 9, new int[]{3,4}),
                Arguments.of(new int[]{5,75,25}, 100, new int[]{1,2})
        );
    }
}

