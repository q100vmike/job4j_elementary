package ru.job4j.exam;

public class FirstExam {

    public static int[] arrayExpon(int[] arr) {
        int j = 1;
        int i = 0;
        int n = arr.length - 1;
        int tmp;
        boolean counter = true;
        boolean contineFlag = false;

        for (int k = 0; k <= n; k++) {
            arr[k] *= arr[k];
        }
        while (counter && n > 0) {
            if (arr[i] > arr[j]) {
                tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                contineFlag = true;
            }
            j++;
            i++;
            if (j > n) {
                if (contineFlag) {
                    j = 1;
                    i = 0;
                    counter = true;
                    contineFlag = false;
                } else {
                    counter = false;
                }
            } else {
                counter = true;
            }
        }
        return arr;
    }
}

