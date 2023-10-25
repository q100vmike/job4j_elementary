package ru.job4j.exam;

public class FirstExam {

    public static int[] arrayExpon(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
        int tmp;

        arr[0] *= arr[0];

        while (j != i) {
            arr[j] *= arr[j];
            if (arr[i] > arr[j]) {
                tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                j--;
                if (tmp == 0 && i != j) {
                    i++;
                    arr[i] *= arr[i];
                }
            } else {
                j--;
            }
        }
        return arr;
    }
}

