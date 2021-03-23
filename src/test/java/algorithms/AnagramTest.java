package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

    @Test
    void axlRose() {
        assertTrue(Anagram.isAnagram("axlrose", "oralsex"));
        assertTrue(Anagram.isAnagram("acaba", "aaacb"));
    }

    @Test
    void notanagram() {
        assertFalse(Anagram.isAnagram("axelrose", "oralsex"));
        assertFalse(Anagram.isAnagram("acabad", "aaacb"));
    }
}
