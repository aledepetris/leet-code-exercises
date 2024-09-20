package pointers;

import com.aledepetris.roadmap.algomap.pointers.TwoSumPointers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestTwoSumPointers {

    TwoSumPointers twoSumPointers = new TwoSumPointers();

    @ParameterizedTest
    @MethodSource("testData")
    void testTwoSum(int[] numbers, int target, int[] expectedOutput) {
        int[] result = twoSumPointers.twoSum(numbers, target);
        assertThat(result).isEqualTo(expectedOutput);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{1, 3, 4, 5, 7, 10, 11}, 9, new int[]{3, 4}),
                Arguments.of(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8, new int[]{4, 5}),
                Arguments.of(new int[]{1, 2}, 3, new int[]{1, 2}), // Caso mínimo
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 11, new int[]{5, 6}) // Caso límite con los últimos elementos
        );
    }

}
