package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.TwoSum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestTwoSum {

    TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("testData")
    void testTwoSum(int[] nums, int target, int[] expectedIndices) {
        assertThat(twoSum.twoSum(nums, target)).containsExactlyInAnyOrder(expectedIndices);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 9, new int[]{3, 4}),
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, -8, new int[]{2, 4}),
                Arguments.of(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3}),
                Arguments.of(new int[]{1, 5, 6, 7, 8}, 13, new int[]{2, 3}),
                Arguments.of(new int[]{1, 10, 25, 35, 60}, 85, new int[]{2, 4})
        );
    }

}
