package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.MajorityElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMajorityElement {

    MajorityElement finder = new MajorityElement();

    @ParameterizedTest
    @MethodSource("testData")
    void testMajorityElement(int[] input, int expected) {
        assertEquals(expected, finder.majorityElement(input));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{6, 5, 5}, 5),
                Arguments.of(new int[]{1, 1, 2, 2, 2}, 2),
                Arguments.of(new int[]{4, 4, 4, 4, 4, 3, 4}, 4)
        );
    }

}
