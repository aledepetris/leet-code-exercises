package com.aledepetris.roadmap.neetcode.arrays.hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestGroupAnagrams {

    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @ParameterizedTest
    @MethodSource("testData")
    void test(String[] input, List<List<String>> expected) {
        List<List<String>> result = groupAnagrams.groupAnagrams(input);

        // Normalizamos: ordenamos elementos dentro de cada grupo, y ordenamos los grupos
        List<List<String>> normalizedResult = normalize(result);
        List<List<String>> normalizedExpected = normalize(expected);

        assertThat(normalizedResult).isEqualTo(normalizedExpected);
    }

    private static List<List<String>> normalize(List<List<String>> list) {
        return list.stream()
                .map(subList -> subList.stream().sorted().collect(Collectors.toList()))
                .sorted(Comparator.comparing(l -> String.join(",", l)))
                .collect(Collectors.toList());
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        Arrays.asList(
                                Arrays.asList("bat"),
                                Arrays.asList("nat", "tan"),
                                Arrays.asList("ate", "eat", "tea")
                        )
                ),
                Arguments.of(
                        new String[]{""},
                        Arrays.asList(
                                Arrays.asList("")
                        )
                ),
                Arguments.of(
                        new String[]{"a"},
                        Arrays.asList(
                                Arrays.asList("a")
                        )
                ),
                Arguments.of(
                        new String[]{"abc", "bca", "cab", "xyz", "zyx"},
                        Arrays.asList(
                                Arrays.asList("abc", "bca", "cab"),
                                Arrays.asList("xyz", "zyx")
                        )
                ),
                Arguments.of(
                        new String[]{},
                        Collections.emptyList()
                )
        );
    }
}
