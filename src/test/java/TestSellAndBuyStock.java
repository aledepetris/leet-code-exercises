import com.aledepetris.roadmap.algomap.stringsarrays.SellAndBuyStock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestSellAndBuyStock {

    SellAndBuyStock stockTrade = new SellAndBuyStock();

    @ParameterizedTest
    @MethodSource("testData")
    void testRomanToIntExample(int[] numbers, int resulExpected) {
        assertThat(stockTrade.maxProfit(numbers)).isEqualTo(resulExpected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{3, 3, 3, 3, 3}, 0),
                Arguments.of(new int[]{5}, 0),
                Arguments.of(new int[]{2, 4, 1}, 2),
                Arguments.of(new int[]{3, 2, 6, 5, 0, 3}, 4),
                Arguments.of(new int[]{3, 8, 2, 6, 5, 0, 3}, 5)
        );
    }

}
