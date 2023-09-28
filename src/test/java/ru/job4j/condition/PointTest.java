package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when06to20then6dot32() {
        double expected = 6.32;
        int x1 = 0;
        int y1 = 6;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to33then2dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1to3then6dot70() {
        double expected = 6.70;
        int x1 = 0;
        int y1 = 9;
        int x2 = 6;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
         assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}