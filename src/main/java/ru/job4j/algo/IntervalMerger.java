package ru.job4j.algo;

import java.util.Arrays;
import java.util.Comparator;

public class IntervalMerger {

    public int[][] merge(int[][] intervals) {
        int i = 0, nexj = 0, j = 0;
        int[][] result = new int[intervals.length][2];
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];

        for (i = 0; i < intervals.length - 1; i++) {
            nexj = intervals[i][1];
            if (nexj < intervals[i + 1][0]) {
                result[j][0] = start;
                result[j][1] = intervals[i][1];
                j++;
                start = intervals[i + 1][0];
            }
            if (i == intervals.length - 2) {
                result[j][0] = start;
                result[j][1] = intervals[i + 1][1];
            }
        }
        result = Arrays.copyOfRange(result, 0, j + 1);

        return result;
    }
}
