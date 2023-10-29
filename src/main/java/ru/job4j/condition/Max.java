package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int center) {
        int result = max(left, right) >= center ? max(left, right) : center;
        return result;
    }

    public static int max(int left, int right, int center, int upper) {
        int result = max(left, right) >= max(center, upper) ? max(left, right) : max(center, upper);
        return result;
    }
}
