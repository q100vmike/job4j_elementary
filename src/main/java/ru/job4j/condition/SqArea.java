package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = 0;
        double l = 0;
        double s = 0;

        h = p / (2 * (k + 1));

        l = h * k;

        s = l * h;

        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}