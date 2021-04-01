package algorithms;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static algorithms.CharacterCountDecoder.decode;
import static org.assertj.core.api.Assertions.assertThat;

@Disabled // For now ;)
class CharacterCountDecoderTest {

    @Test
    void testDecodeLongString() {
        assertThat(decode("a4b4c4d1a1b1c1")).isEqualTo("aaaabbbbccccdabc");
    }

    @Test
    void testDecodeShortString() {
        assertThat(decode("a1b1c1")).isEqualTo("abc");
    }

    @Test
    void testDecodeEmpty() {
        assertThat(decode("")).isEmpty();
    }
}
