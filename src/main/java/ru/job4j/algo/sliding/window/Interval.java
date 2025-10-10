package ru.job4j.algo.sliding.window;

import java.util.*;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", start, end);
    }

    public class Main {

        public static int[] findMaxOverlapInterval(List<Interval> intervals) {
            if (intervals.isEmpty() || intervals.size() == 0) {
                return new int[] {-1, -1};
            }
            Comparator<Interval> comparatorIntervalEnd = Comparator.comparingInt(i -> i.end);
            Comparator<Interval> comparatorIntervalStart = Comparator.comparingInt(i -> i.start);
            Collections.sort(intervals, comparatorIntervalStart);
            PriorityQueue<Interval> activeIntervals = new PriorityQueue(comparatorIntervalEnd);
            int maxOverlap = 0;
            int maxStart = -1;
            int minEnd = -1;
            int prevEnd = -1;
            int prevStart = -1;

            for (Interval interval : intervals) {
                while (activeIntervals.size() > 0 && activeIntervals.peek().end < interval.start) {
                    activeIntervals.poll();
                }
                activeIntervals.add(interval);
                if (activeIntervals.size() > maxOverlap) {
                    maxOverlap = activeIntervals.size();
                    for (Interval activeInterval : activeIntervals) {
                            maxStart = Math.max(maxStart, activeInterval.start);
                            minEnd = Math.min(minEnd, activeInterval.end);
                        if (maxStart == minEnd) {
                            maxStart = prevStart;
                            minEnd = prevEnd;
                        }
                        prevEnd = activeInterval.end;
                        prevStart = activeInterval.start;
                    }
                    if (maxStart > minEnd) {
                        maxStart = activeIntervals.peek().start;
                        minEnd = activeIntervals.peek().end;
                    }
                }
            }
            return new int[] {maxStart, minEnd};
        }

        public static void main(String[] args) {
            List<Interval> intervals = new ArrayList<>();
            intervals.add(new Interval(1, 4));
            intervals.add(new Interval(2, 3));
            intervals.add(new Interval(3, 2));
            intervals.add(new Interval(4, 1));
            int[] result = findMaxOverlapInterval(intervals);
            System.out.println("Interval that overlaps the maximum number of intervals: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
