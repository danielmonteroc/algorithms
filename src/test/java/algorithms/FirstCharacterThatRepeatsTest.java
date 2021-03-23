package algorithms;

import org.junit.jupiter.api.Test;

import static algorithms.FirstCharacterThatRepeats.getFirstRepeatCharacter;
import static org.assertj.core.api.Assertions.assertThat;

class FirstCharacterThatRepeatsTest {

    @Test
    void testAbcabc() {
        assertThat(getFirstRepeatCharacter("abcabc")).isEqualTo('a');
    }

    @Test
    void testAbcbca() {
        assertThat(getFirstRepeatCharacter("abcbca")).isEqualTo('b');
    }

    @Test
    void testEmpty() {
        assertThat(getFirstRepeatCharacter("")).isEqualTo((char) 0);
    }

    @Test
    void testAa() {
        assertThat(getFirstRepeatCharacter("aa")).isEqualTo('a');
    }

    @Test
    void testAbba() {
        assertThat(getFirstRepeatCharacter("abba")).isEqualTo('b');
    }

    @Test
    void testNotRepeatedLongString() {
        assertThat(getFirstRepeatCharacter("abcdefghijklmnopqrstuvwxyz")).isEqualTo((char) 0);
    }
}
