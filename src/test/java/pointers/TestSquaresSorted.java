package pointers;

import com.aledepetris.roadmap.algomap.pointers.SquaresSorted;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestSquaresSorted {

    SquaresSorted squaresSorted = new SquaresSorted();

    @ParameterizedTest
    @MethodSource("testData")
    void testSortedSquares(int[] nums, int[] expectedNums) {
        int[] result = squaresSorted.sortedSquares(nums);
        assertThat(result).isEqualTo(expectedNums);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-4,-1,0,3,10}, new int[]{0,1,9,16,100}),
                Arguments.of(new int[]{-7,-3,2,3,11}, new int[]{4,9,9,49,121}),
                Arguments.of(new int[]{0,1,2}, new int[]{0,1,4}),
                Arguments.of(new int[]{-5,-3,-2,-1}, new int[]{1,4,9,25}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }

}
