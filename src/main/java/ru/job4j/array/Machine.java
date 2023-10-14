package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money  -= price;
        for (int i : coins) {
            while (i <= money) {
                money -= i;
                rsl[size] = i;
                size++;
            }
            if (money == 0) {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
