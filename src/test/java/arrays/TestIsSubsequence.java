package arrays;

import com.aledepetris.roadmap.algomap.arrays.IsSubSequence;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestIsSubsequence {

    IsSubSequence isSubSequence = new IsSubSequence();

    @ParameterizedTest
    @MethodSource("testData")
    void testRomanToIntExample(String subSequence, String sequence, Boolean result) {
        assertThat(isSubSequence.isSubsequence(subSequence, sequence)).isEqualTo(result);
    }


    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("ace", "abcde", true),
                Arguments.of("", "abc", true),
                Arguments.of("abc", "", false),
                Arguments.of("a", "a", true),
                Arguments.of("abc", "acb", false)
        );
    }

}
