package ru.job4j.array;

public class Matrix {
        public static int[][] multiple(int size) {
            int[][] table = new int[size][size];
            for (int i = 1; i <= table.length; i++) {
                for (int j = 1; j <= table[i - 1].length; j++) {
                    table[i - 1][j - 1] = i * j;
                }
            }
            return table;
        }
}
