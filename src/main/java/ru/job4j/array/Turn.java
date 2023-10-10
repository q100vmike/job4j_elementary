package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[array.length  - (i + 1)];
            array[array.length  - (i + 1)] = array[i];
            array[i] = temp;
            if (i == (array.length - 1) / 2) {
                break;
            }
        }
        return array;
    }
}
