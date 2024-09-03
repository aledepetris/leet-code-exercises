package arrays;

import com.aledepetris.roadmap.algomap.arrays.SpiralMatrix;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestSpiralMatrix {

    private final SpiralMatrix spiralMatrix = new SpiralMatrix();

    @ParameterizedTest
    @MethodSource("testData")
    void testSpiralOrder(int[][] matrix, List<Integer> expected) {
        assertThat(spiralMatrix.spiralOrder(matrix)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)
                ),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12}
                        },
                        Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
                ),
                Arguments.of(
                        new int[][]{
                                {1, 2},
                                {3, 4}
                        },
                        Arrays.asList(1, 2, 4, 3)
                ),
                Arguments.of(
                        new int[][]{
                                {1}
                        },
                        Arrays.asList(1)
                ),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3, 4}
                        },
                        Arrays.asList(1, 2, 3, 4)
                ),
                Arguments.of(
                        new int[][]{
                                {1},
                                {2},
                                {3},
                                {4}
                        },
                        Arrays.asList(1, 2, 3, 4)
                )
        );
    }
}
