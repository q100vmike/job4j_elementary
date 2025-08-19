package ru.job4j.algo;

import org.junit.jupiter.api.Test;
import ru.job4j.array.Machine;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.algo.SmallestRangeFinder.findSmallestRange;

class SmallestRangeFinderTest {
    @Test
    public void Whenk3SmallestRange0and2() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        int[] expected = {0, 2};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void Whenk3SmallestRange2and4() {
        int[] nums = {1, 2, 2, 3, 4, 5};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        int[] expected = {2, 4};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void Whenk3SmallestRangeIsnull() {
        int[] nums = {1, 2, 2, 2, 3, 3};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        assertThat(result).isNull();
    }

    @Test
    public void Whenk4SmallestRangeIs0and3() {
        int[] nums = {1, 2, 4, 5, 6, 7};
        int k = 4;
        int[] result = findSmallestRange(nums, k);
        int[] expected = {0,3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void Whenk4SmallestRangeIs0and4() {
        int[] nums = {2, 2, 4, 5, 6, 7};
        int k = 4;
        int[] result = findSmallestRange(nums, k);
        int[] expected = {0,3};
        assertThat(result).containsExactly(expected);
    }
}