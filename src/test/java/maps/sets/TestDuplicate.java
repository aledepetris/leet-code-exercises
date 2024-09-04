package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.DuplicateChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestDuplicate {

    DuplicateChecker duplicateChecker = new DuplicateChecker();

    @ParameterizedTest
    @MethodSource("testData")
    void testContainsDuplicate(int[] nums, boolean resultExpected) {
        assertThat(duplicateChecker.containsDuplicate(nums)).isEqualTo(resultExpected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1}, false),
                Arguments.of(new int[]{}, false),
                Arguments.of(new int[]{2, 2, 2, 2}, true),
                Arguments.of(new int[]{10, 20, 30, 40}, false)
        );
    }

}
