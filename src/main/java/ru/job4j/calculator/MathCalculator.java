package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubAndDiv(double first, double second) {
        return sum(subtraction(first, second), division(first, second));
    }

    public static double sumAllFunc(double first, double second) {
        return sum(sum(subtraction(first, second), division(first, second)), sum(sum(first, second), multiply(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumSubAndDiv равен: " + sumSubAndDiv(10, 20));
        System.out.println("Результат расчета sumAllFunc равен: " + sumAllFunc(10, 20));
    }
}
