package ru.job4j.algo.sliding.window;

import java.util.*;

public class IntervalOverlapSlidingWindow {

    public static int[] findMaxOverlapInterval(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[]{0, 0};
        }
        // Собираем все уникальные точки
        Set<Integer> pointsSet = new HashSet<>();
        for (int[] interval : intervals) {
            pointsSet.add(interval[0]);
            pointsSet.add(interval[1]);
        }
        List<Integer> points = new ArrayList<>(pointsSet);
        Collections.sort(points);
        int maxOverlap = 0;
        int bestStart = points.get(0);
        int bestEnd = points.get(0);
        // Используем два указателя для скользящего окна
        for (int i = 0; i < points.size(); i++) {
            int start = points.get(i);

            for (int j = i; j < points.size(); j++) {
                int end = points.get(j);

                // Пропускаем нулевые интервалы
                if (start == end) continue;

                int overlapCount = countOverlapsForInterval(start, end, intervals);

                // Обновляем максимум, предпочитая более короткие интервалы
                if (overlapCount > maxOverlap ||
                        (overlapCount == maxOverlap && (end - start) < (bestEnd - bestStart))) {
                    maxOverlap = overlapCount;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }

        return new int[]{bestStart, bestEnd};
    }

    private static int countOverlapsForInterval(int start, int end, int[][] intervals) {
        int count = 0;
        for (int[] interval : intervals) {
            if (start <= interval[1] && end >= interval[0]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {3, 5}, {4, 6}};
        int[] result = findMaxOverlapInterval(intervals);

        System.out.println("Интервал с максимальным перекрытием: [" +
                result[0] + ", " + result[1] + "]");
        System.out.println("Количество перекрытий: " +
                countOverlapsForInterval(result[0], result[1], intervals));
    }
}

