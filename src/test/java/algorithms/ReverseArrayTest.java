package algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseArrayTest {

    @Test
    void reverse5() {
        int[] array = {1, 2, 3, 4, 5};
        ReverseArray.reverse(array);
        assertThat(array).isEqualTo(new int[] {5, 4, 3, 2, 1});
    }

    @Test
    void reverse4() {
        int[] array = {1, 2, 3, 4};
        ReverseArray.reverse(array);
        assertThat(array).isEqualTo(new int[] {4, 3, 2, 1});
    }

    @Test
    void reverse1() {
        int[] array = {1};
        ReverseArray.reverse(array);
        assertThat(array).isEqualTo(new int[] {1});
    }
}
