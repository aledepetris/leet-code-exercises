package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.RansomNote;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestRansomNote {

    private final RansomNote ransomNoteChecker = new RansomNote();

    @ParameterizedTest
    @MethodSource("testData")
    void testCanConstruct(String ransomNote, String magazine, boolean resultExpected) {
        assertThat(ransomNoteChecker.canConstruct(ransomNote, magazine)).isEqualTo(resultExpected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true),
                Arguments.of("hello", "ollhe", true),
                Arguments.of("test", "tset", true),
                Arguments.of("abc", "def", false)
        );
    }

}
