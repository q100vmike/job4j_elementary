package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when06to20then6dot32() {
        double expected = 6.32;
        Point a = new Point(0, 6);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to33then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1to3then6dot70() {
        double expected = 6.70;
        Point a = new Point(0, 9);
        Point b = new Point(6, 6);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}