package pointers;

import com.aledepetris.roadmap.algomap.pointers.Sum3;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * 15. 3Sum - Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
 * and j != k, and nums[i] + nums[j] + nums[k] == 0. Notice that the solution set must not contain duplicate triplets.
 */
class TestSum3 {

    Sum3 sum3 = new Sum3();

    @ParameterizedTest
    @MethodSource("testData")
    void testThreeSum(int[] nums, List<List<Integer>> expectedOutput) {
        List<List<Integer>> result = sum3.threeSum(nums);

        assertThat(result).hasSameSizeAs(expectedOutput);

        for (List<Integer> expectedList : expectedOutput) {
            boolean matched =  result.stream()
                    .anyMatch(list -> list.containsAll(expectedList)
                            && expectedList.containsAll(list));

            assertThat(matched).isTrue();
        }
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1, 0, 1, 2, -1, -4},
                        Arrays.asList(
                                Arrays.asList(-1, -1, 2),
                                Arrays.asList(-1, 0, 1)
                        )
                ),
                Arguments.of(
                        new int[]{0, 0, 0, 0},
                        List.of(
                                Arrays.asList(0, 0, 0)
                        )
                ),
                Arguments.of(
                        new int[]{-2, 0, 1, 1, 2},
                        Arrays.asList(
                                Arrays.asList(-2, 0, 2),
                                Arrays.asList(-2, 1, 1)
                        )
                ),
                Arguments.of(
                        new int[]{},
                        List.of()
                ),
                Arguments.of(
                        new int[]{1, 2, -2, -1},
                        List.of()
                )
        );
    }


}
