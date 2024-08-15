import org.example.MergeStringAlternately;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestMergeStringAlternately {

    private final MergeStringAlternately merger = new MergeStringAlternately();

    @Test
    void testMergeAlternately_sameLengthStrings() {
        String word1 = "abc";
        String word2 = "def";
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo("adbecf");
    }

    @Test
    void testMergeAlternately_word1Longer() {
        String word1 = "abcd";
        String word2 = "xy";
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo("axbycd");
    }

    @Test
    void testMergeAlternately_word2Longer() {
        String word1 = "ab";
        String word2 = "xyz";
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo("axbyz");
    }

    @Test
    void testMergeAlternately_emptyWord1() {
        String word1 = "";
        String word2 = "xyz";
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo("xyz");
    }

    @Test
    void testMergeAlternately_emptyWord2() {
        String word1 = "abc";
        String word2 = "";
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo("abc");
    }

    @Test
    void testMergeAlternately_bothWordsEmpty() {
        String word1 = "";
        String word2 = "";
        String result = merger.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo("");
    }


}
