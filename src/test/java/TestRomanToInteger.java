import com.aledepetris.roadmap.algomap.stringsarrays.RomanToInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestRomanToInteger {

    RomanToInteger converter = new RomanToInteger();

    @ParameterizedTest
    @MethodSource("testData")
    void testRomanToIntExample(String romanNumber, int intExpected) {
        assertThat(converter.romanToInt(romanNumber)).isEqualTo(intExpected);
    }


    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("IX", 9),
                Arguments.of("X", 10),
                Arguments.of("XL", 40),
                Arguments.of("L", 50),
                Arguments.of("LX", 60),
                Arguments.of("XC", 90),
                Arguments.of("C", 100),
                Arguments.of("CX", 110),
                Arguments.of("CD", 400),
                Arguments.of("D", 500),
                Arguments.of("CM", 900),
                Arguments.of("M", 1000),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }

}
