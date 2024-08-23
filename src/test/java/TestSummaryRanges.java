import static org.assertj.core.api.Assertions.assertThat;

import com.aledepetris.roadmap.algomap.stringsarrays.SummaryRanges;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class TestSummaryRanges {

    @ParameterizedTest
    @MethodSource("testData")
    void testSummaryRanges(int[] numbers, List<String> expected) {
        SummaryRanges summaryRanges = new SummaryRanges();
        assertThat(summaryRanges.summaryRanges(numbers)).isEqualTo(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, List.of("0->2", "4->5", "7")),
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, List.of("0", "2->4", "6", "8->9")),
                Arguments.of(new int[]{}, List.of()),
                Arguments.of(new int[]{1}, List.of("1")),
                Arguments.of(new int[]{-2, -1, 0, 2, 3, 5, 6, 7}, List.of("-2->0", "2->3", "5->7"))
        );
    }
}
