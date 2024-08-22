import com.aledepetris.roadmap.algomap.stringsarrays.MergeStringAlternately;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestMergeStringAlternately {

    private final MergeStringAlternately merger = new MergeStringAlternately();

    @ParameterizedTest
    @MethodSource("testData")
    void testMergeAlternately(String word1, String word2, String expected) {
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abc", "def", "adbecf"),
                Arguments.of("abcd", "xy", "axbycd"),
                Arguments.of("ab", "xyz", "axbyz"),
                Arguments.of("", "xyz", "xyz"),
                Arguments.of("abc", "", "abc"),
                Arguments.of("", "", "")
        );
    }


}
