package ru.job4j.algo;

import java.util.Arrays;
import java.util.Comparator;

public class IntervalMerger {

    public int[][] merge(int[][] intervals) {
        int i = 0, nexj = 0, j = 0;
        int[] array = new int[intervals.length * 2];
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];

        for (i = 0; i < intervals.length - 1; i++) {
            nexj = intervals[i][1];
            if (nexj < intervals[i + 1][0]) {
                array[j] = start;
                array[j + 1] = intervals[i][1];
                j += 2;
                start = intervals[i + 1][0];
            }
            if (i == intervals.length - 2) {
                array[j] = start;
                array[j + 1] = intervals[i + 1][1];
            }
        }
        array = Arrays.copyOfRange(array, 0, j + 2);
        int rows = array.length / 2;
        int[][] result = new int[rows][2];

        for (int k = 0; k < rows; k++) {
            for (int m = 0; m < 2; m++) {
                result[k][m] = array[k * 2 + m];
            }
        }

        return result;
    }
}
