package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan174Then85dot1() {
        short in = 174;
        double expected = 85.1;
        double out = Fit.manWeight(in);

        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman160Then57dot49() {
        short in = 160;
        double expected = 57.49;
        double out = Fit.womanWeight(in);

       assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}