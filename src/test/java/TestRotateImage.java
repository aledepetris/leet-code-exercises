import com.aledepetris.roadmap.algomap.stringsarrays.RotateImage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestRotateImage {

    RotateImage rotateImage = new RotateImage();

    @ParameterizedTest
    @MethodSource("testData")
    void testRotateImage(int[][] matrix, int[][] resultExpected) {
        rotateImage.rotate(matrix);
        assertThat(matrix).isEqualTo(resultExpected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}
                ),
                Arguments.of(
                        new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}},
                        new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}
                ),
                Arguments.of(
                        new int[][]{{1}},
                        new int[][]{{1}}
                ),
                Arguments.of(
                        new int[][]{{1, 2}, {3, 4}},
                        new int[][]{{3, 1}, {4, 2}}
                ),
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}},
                        new int[][]{{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}}
                )
        );
    }

}
