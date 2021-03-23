package algorithms;

import org.junit.jupiter.api.Test;

import static algorithms.AnagramAddReduce.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramReducerTest {

    @Test
    void axlRose() {
        assertTrue(isAnagram("axlrose", "oralsex"));
        assertTrue(isAnagram("acaba", "aaacb"));
    }

    @Test
    void notanagram() {
        assertFalse(isAnagram("axelrose", "oralsex"));
        assertFalse(isAnagram("acabad", "aaacb"));
    }
}
