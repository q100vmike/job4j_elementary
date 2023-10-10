package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap6to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int source = 6;
        int dest = 9;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 6, 10, 8, 9, 7, 11};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int source = 3;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 9, 5, 6, 7, 8, 4, 10, 11};
        assertThat(result).containsExactly(expected);
    }

}