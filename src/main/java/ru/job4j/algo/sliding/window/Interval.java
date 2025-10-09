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
            if (intervals.size() == 1) {
                return new int[] {intervals.get(0).start, intervals.get(0).end};
            }
            Comparator<Interval> comparatorIntervalEnd = Comparator.comparingInt(i -> i.end);
            Comparator<Interval> comparatorIntervalStart = Comparator.comparingInt(i -> i.start);
            Collections.sort(intervals, comparatorIntervalStart);
            PriorityQueue<Interval> activeIntervals = new PriorityQueue(comparatorIntervalEnd);
            int maxOverlap = 0;
            int maxStart = -1;
            int minEnd = -1;

            for (Interval interval : intervals) {
                while (activeIntervals.size() > 0 && activeIntervals.peek().end < interval.start) {
                    activeIntervals.poll();
                }
                activeIntervals.add(interval);

                if (activeIntervals.size() > maxOverlap) {
                    maxOverlap = activeIntervals.size();
                    for (Interval activeInterval : activeIntervals) {
                        if (Math.max(maxStart, activeInterval.start) != Math.min(minEnd, activeInterval.end)) {
                            maxStart = Math.max(maxStart, activeInterval.start);
                            minEnd = Math.min(minEnd, activeInterval.end);
                        }
                    }
                    if (maxStart > minEnd) {
                        maxStart = activeIntervals.peek().start;
                        minEnd = activeIntervals.peek().end;
                    }
                }
            }
            return new int[] {
                    maxStart, minEnd
            };
        }

        public static void main(String[] args) {
            List<Interval> intervals = new ArrayList<>();
            intervals.add(new Interval(1, 4));
            intervals.add(new Interval(2, 6));
            intervals.add(new Interval(3, 5));
            intervals.add(new Interval(7, 8));

            int[] result = findMaxOverlapInterval(intervals);
            System.out.println("Interval that overlaps the maximum number of intervals: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
