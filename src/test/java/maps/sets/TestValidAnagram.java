package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.ValidAnagram;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestValidAnagram {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @ParameterizedTest
    @MethodSource("testData")
    void testIsAnagram(String s, String t, boolean resultExpected) {
        assertThat(validAnagram.isAnagram(s, t)).isEqualTo(resultExpected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("a", "a", true),
                Arguments.of("ab", "a", false),
                Arguments.of("", "", true),
                Arguments.of("listen", "silent", true),
                Arguments.of("triangle", "integral", true),
                Arguments.of("apple", "papel", true),
                Arguments.of("hello", "bello", false),
                Arguments.of("software", "swearoft", true),
                Arguments.of("abcd", "dcba", true),
                Arguments.of("abcde", "edcba", true),
                Arguments.of("abcd", "abce", false),
                Arguments.of("abcd", "abcdd", false),
                Arguments.of("xxyyzz", "zzyyxx", true)
        );
    }

}
