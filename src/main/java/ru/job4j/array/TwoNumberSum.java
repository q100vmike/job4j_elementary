package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;

        while (i < array.length - 1) {
            j++;
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
        }
        return new int[0];
    }
}
