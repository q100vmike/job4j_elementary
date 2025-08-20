package ru.job4j.exam;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FirstExamTest {

    @Test
    public void firstExamRepeat() {
        int[] data = new int[]{-5, -7, -8, 9};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{25, 49, 64, 81};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamAllMinusNoNul() {
        int[] data = new int[]{-3, -5, -6, -2, -1};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{1, 4, 9, 25, 36};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamAllMinus() {
        int[] data = new int[]{-4, -3, -2, -1, 0};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamOne1() {
        int[] data = new int[]{-3, -2, 1, 4, 5};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{1, 4, 9, 16, 25};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamTwo() {
        int[] data = new int[]{-1, 0, 10};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{0, 1, 100};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamThree() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{1, 4, 9, 16, 25};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamFour() {
        int[] data = new int[]{-5, -2, 3, 4, 6};
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{4, 9, 16, 25, 36};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamFive() {
        int[] data = new int[]{-6, -5, -1, 0, 7, 9 };
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{0, 1, 25, 36, 49, 81};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamSix() {
        int[] data = new int[]{-6, -5 };
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{25, 36};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstExamSeven() {
        int[] data = new int[]{-6 };
        int[] result = FirstExam.arrayExpon(data);
        int[] expected = new int[]{36};
        assertThat(result).containsExactly(expected);
    }
}