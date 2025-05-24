package com.aledepetris.roadmap.algomaster.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBestTimeBuySellStockII {

    BestTimeBuySellStockII stockTrader = new BestTimeBuySellStockII();

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] prices, int expectedProfit) {
        assertThat(stockTrader.maxProfit(prices)).isEqualTo(expectedProfit);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 0, 2}, 4),
                Arguments.of(new int[]{1, 2}, 1),
                Arguments.of(new int[]{2, 1}, 0),
                Arguments.of(new int[]{3, 2, 6, 5, 0, 3}, 7)
        );
    }
}

