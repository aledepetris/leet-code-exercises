package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.LongestSequence;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class LongestSequenceTest {

    LongestSequence sequence = new LongestSequence();

    @ParameterizedTest
    @MethodSource("testData")
    void testLongestConsecutive(int[] nums, int expectedLength) {
        assertThat(sequence.longestConsecutive(nums)).isEqualTo(expectedLength);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{100, 4, 200, 1, 3, 2}, 4),
                Arguments.of(new int[]{0, -1}, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5),
                Arguments.of(new int[]{1, 3, 5, 7}, 1),
                Arguments.of(new int[]{1, 1, 0, 0, 0}, 2),
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, 5),
                Arguments.of(new int[]{5, 10, 100, 1000}, 1),
                Arguments.of(new int[]{}, 0)
        );
    }
}