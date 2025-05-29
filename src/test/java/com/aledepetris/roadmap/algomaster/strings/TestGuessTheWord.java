package com.aledepetris.roadmap.algomaster.strings;
import com.aledepetris.roadmap.algomaster.strings.guessword.GuessTheWord;
import com.aledepetris.roadmap.algomaster.strings.guessword.Master;
import com.aledepetris.roadmap.algomaster.strings.guessword.MasterImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestGuessTheWord {

    @ParameterizedTest
    @MethodSource("testCases")
    void testFindSecretWord(String[] wordlist, String secret) {
        Master master = new MasterImpl(secret);
        GuessTheWord guesser = new GuessTheWord();

        guesser.findSecretWord(wordlist, master);

        assertThat(master.getAttempts())
                .withFailMessage("Falló en encontrar la palabra en menos de 10 intentos (usó %s)", master.getAttempts())
                .isLessThanOrEqualTo(10);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new String[]{"acckzz", "ccbazz", "eiowzz", "abcczz"}, "acckzz"
                ),
                Arguments.of(
                        new String[]{"aaaaaa", "bbbbbb", "cccccc", "dddddd", "eeeeee", "ffffff", "gggggg"}, "eeeeee"
                ),
                Arguments.of(
                        new String[]{"aaaaaa", "aaaabb", "aaabbb", "aabbbb", "abbbbb", "bbbbbb"}, "bbbbbb"
                ),
                Arguments.of(
                        new String[]{"abcdef", "ghijkl", "mnopqr", "stuvwx", "yzabcd", "efghij"}, "stuvwx"
                ),
                Arguments.of(
                        new String[]{"acckzz", "ccbazz", "eiowzz", "abcczz", "acckaz", "acckzz"}, "acckzz"
                )
        );
    }
}

