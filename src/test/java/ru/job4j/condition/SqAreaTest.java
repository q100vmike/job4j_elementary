package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Then2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K10Then2dot06() {
        double expected = 2.06;
        int p = 10;
        double k = 10;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP100K50Then48dot05() {
        double expected = 48.05;
        int p = 100;
        double k = 50;
        double out = SqArea.square(p, k);
        //System.out.println(out);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}