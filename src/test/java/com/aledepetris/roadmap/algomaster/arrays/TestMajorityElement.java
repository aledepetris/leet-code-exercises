package com.aledepetris.roadmap.algomaster.arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMajorityElement {

    MajorityElement majorityElement = new MajorityElement();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] nums, int expected) {
        assertThat(majorityElement.majorityElement(nums)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{6, 6, 6, 7, 7}, 6),
                Arguments.of(new int[]{4, 4, 4, 4, 2, 2, 4}, 4)
        );
    }
}