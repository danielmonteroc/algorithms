package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramTest {

    @Test
    void axlRose() {
        assertThat(Anagram.isAnagram("axlrose", "oralsex")).isTrue();
        assertThat(Anagram.isAnagram("acaba", "aaacb")).isTrue();
    }

    @Test
    void notanagram() {
        assertThat(Anagram.isAnagram("axelrose", "oralsex")).isFalse();
        assertThat(Anagram.isAnagram("acabad", "aaacb")).isFalse();
    }
}
