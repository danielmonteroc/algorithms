package algorithms;

import org.junit.jupiter.api.Test;

import static algorithms.AnagramAddReduce.isAnagram;
import static org.assertj.core.api.Assertions.assertThat;

class AnagramReducerTest {

    @Test
    void axlRose() {
        assertThat(isAnagram("axlrose", "oralsex")).isTrue();
        assertThat(isAnagram("acaba", "aaacb")).isTrue();
    }

    @Test
    void notanagram() {
        assertThat(isAnagram("axelrose", "oralsex")).isFalse();
        assertThat(isAnagram("acabad", "aaacb")).isFalse();
    }
}
