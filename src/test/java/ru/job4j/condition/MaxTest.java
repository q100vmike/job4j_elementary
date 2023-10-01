package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To8Then10() {
        int left = 10;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax44To44Then44() {
        int left = 44;
        int right = 44;
        int result = Max.max(left, right);
        int expected = 44;
        assertThat(result).isEqualTo(expected);
    }
}