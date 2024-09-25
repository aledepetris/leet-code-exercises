package pointers;

import com.aledepetris.roadmap.algomap.pointers.ContainerWithMostWater;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestContainerWithMostWater {

    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @ParameterizedTest
    @MethodSource("testData")
    void testMaxArea(int[] height, int expectedOutput) {
        int result = containerWithMostWater.maxArea(height);
        assertThat(result).isEqualTo(expectedOutput);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int[]{1, 2, 1}, 2),
                Arguments.of(new int[]{1, 3, 2, 5, 25, 24, 5}, 24)
        );
    }

}
