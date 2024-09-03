package arrays;

import com.aledepetris.roadmap.algomap.arrays.LongestCommonPrefix;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestLongestCommonPrefix {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("testData")
    void testRomanToIntExample(String[] strsArray, String expectedPrefix) {
        assertThat(longestCommonPrefix.longestCommonPrefix(strsArray)).isEqualTo(expectedPrefix);
    }


    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"interspecies", "interstellar", "interstate"}, "inters"),
                Arguments.of(new String[]{"throne", "dungeon"}, ""),
                Arguments.of(new String[]{"throne", "throne"}, "throne"),
                Arguments.of(new String[]{"throne", "thron", "throne"}, "thron"),
                Arguments.of(new String[]{"", "nonempty"}, ""),
                Arguments.of(new String[]{"abc", "abcd", "ab"}, "ab"),
                Arguments.of(new String[]{"a", "a", "a"}, "a"),
                Arguments.of(new String[]{"longest", "longer", "long"}, "long")
        );
    }

}
