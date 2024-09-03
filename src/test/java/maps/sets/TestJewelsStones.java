package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.JewelsStones;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestJewelsStones {

    JewelsStones jewelsStones = new JewelsStones();

    @ParameterizedTest
    @MethodSource("testData")
    void testNumJewelsInStones(String jewels, String stones, int expectedCount) {
        assertThat(jewelsStones.numJewelsInStones(jewels, stones)).isEqualTo(expectedCount);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("aA", "aAAbbbb", 3),
                Arguments.of("z", "ZZ", 0),
                Arguments.of("b", "abc", 1),
                Arguments.of("", "xyz", 0),
                Arguments.of("a", "", 0),
                Arguments.of("abc", "aabbcc", 6),
                Arguments.of("AB", "AAABBB", 6)
        );
    }

}
