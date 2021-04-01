package algorithms;

import org.junit.jupiter.api.Test;

import static algorithms.CharacterCountEncoder.encode;
import static org.assertj.core.api.Assertions.assertThat;

class CharacterCountEncoderTest {

    @Test
    void testEncodeLongString() {
        assertThat(encode("aaaabbbbccccdabc")).isEqualTo("a4b4c4d1a1b1c1");
    }

    @Test
    void testEncodeShortString() {
        assertThat(encode("abc")).isEqualTo("a1b1c1");
    }

    @Test
    void testEncodeEmpty() {
        assertThat(encode("")).isEmpty();
    }
}
