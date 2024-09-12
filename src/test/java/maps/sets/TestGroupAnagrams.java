package maps.sets;

import com.aledepetris.roadmap.algomap.maps.sets.GroupAnagrams;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestGroupAnagrams {

    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @ParameterizedTest
    @MethodSource("testData")
    void testGroupAnagrams(String[] words, List<List<String>> expectedGroups) {
        List<List<String>> result = groupAnagrams.groupAnagrams(words);
        assertThat(result)
                .hasSameSizeAs(expectedGroups);

        for (List<String> expectedGroup : expectedGroups) {
            boolean matched = result.stream()
                    .anyMatch(actualGroup -> actualGroup.containsAll(expectedGroup)
                                    && expectedGroup.containsAll(actualGroup));

            assertThat(matched).isTrue();
        }
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new String[] {"eat", "tea", "tan", "ate", "nat", "bat"},
                        Arrays.asList(
                                Arrays.asList("eat", "tea", "ate"),
                                Arrays.asList("tan", "nat"),
                                Collections.singletonList("bat")
                        )
                ),

                Arguments.of(
                        new String[] {"hello", "world", "java", "python"},
                        Arrays.asList(
                                Collections.singletonList("hello"),
                                Collections.singletonList("world"),
                                Collections.singletonList("java"),
                                Collections.singletonList("python")
                        )
                ),

                Arguments.of(
                        new String[] {"abc", "bca", "cab"},
                        Arrays.asList(
                                Arrays.asList("abc", "bca", "cab")
                        )
                ),

                Arguments.of(
                        new String[] {},
                        Collections.emptyList()
                ),

                Arguments.of(
                        new String[] {"a", "b", "a"},
                        Arrays.asList(
                                Arrays.asList("a", "a"),
                                Collections.singletonList("b")
                        )
                )
        );
    }

}
