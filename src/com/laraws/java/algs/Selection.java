package com.laraws.java.algs;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 11, 23, 33, 88};
        compare(a);
        System.out.println(Arrays.toString(a));
    }

    public static void compare(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
