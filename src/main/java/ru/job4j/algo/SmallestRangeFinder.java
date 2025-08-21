package ru.job4j.algo;

import java.util.Arrays;

public class SmallestRangeFinder {

    public static int[] findSmallestRange(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = k - 1;
        int[] result = new int[]{left, right};

        while ((left <= right) && (right < n)) {
            if (left != right) {
                if (nums[left] != nums[right]) {
                    //left++;
                    right--;
                } else {
                    left = right - 1;
                    right = left + k - 1;
                    result[0] = left;
                    result[1] = right;
                }
            } else {
                if (nums[left - 1] == nums[right] || (nums[right + 1] == nums[left])) {
                    right += k - 1;
                    result[0] = left;
                    result[1] = right;
                } else {
                    break;
                }
            }
        }
        return right >= n ? null : result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 3};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
        nums = new int[]{1, 2, 2, 3, 4, 5};
        k = 4;
        result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }
}