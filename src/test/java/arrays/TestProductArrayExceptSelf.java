package arrays;

import com.aledepetris.roadmap.algomap.arrays.ProductArrayExceptSelf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestProductArrayExceptSelf {

    ProductArrayExceptSelf productArrayExceptSelf = new ProductArrayExceptSelf();

    @ParameterizedTest
    @MethodSource("testData")
    void testProductExceptSelf(int[] nums, int[] expectedArray) {
        int[] result = productArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expectedArray, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
                Arguments.of(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0}),
                Arguments.of(new int[]{0, 0}, new int[]{0, 0}),
                Arguments.of(new int[]{1, 2}, new int[]{2, 1}),
                Arguments.of(new int[]{1, -1}, new int[]{-1, 1})
        );
    }
}
