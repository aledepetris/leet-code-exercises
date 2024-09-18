package pointers;

import com.aledepetris.roadmap.algomap.pointers.ReverseString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestReverString {

    ReverseString reverseString = new ReverseString();

    @ParameterizedTest
    @MethodSource("testData")
    void testReverseString(char[] input, char[] expectedOutput) {
        reverseString.reverseString(input);
        assertThat(input).isEqualTo(expectedOutput);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}),
                Arguments.of(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}, new char[]{'h', 'a', 'n', 'n', 'a', 'H'}),
                Arguments.of(new char[]{'A', 'B'}, new char[]{'B', 'A'}),
                Arguments.of(new char[]{'a'}, new char[]{'a'}),
                Arguments.of(new char[]{}, new char[]{}) // Caso de cadena vacía
        );
    }

}
