package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.Balloons;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestBalloons {

    Balloons balloons = new Balloons();

    @ParameterizedTest
    @MethodSource("testData")
    void testMaxNumberOfBalloons(String text, int expectedCount) {
        assertThat(balloons.maxNumberOfBalloons(text)).isEqualTo(expectedCount);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("nlaebolko", 1),
                Arguments.of("loonbalxballpoon", 2),
                Arguments.of("balloonballoon", 2),
                Arguments.of("ballo", 0),
                Arguments.of("balon", 0),
                Arguments.of("bbaallllooooonnn", 2),
                Arguments.of("xyz", 0),
                Arguments.of("balloonballoonballoon", 3),
                Arguments.of("", 0),
                Arguments.of("bblloonn", 0),
                Arguments.of("ballllllloooooon", 1)
        );
    }

}
