package com.laraws.java.sorting;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = a.length, gap = len / 2;
        shellSort(a, len, gap);
        System.out.println(Arrays.toString(a));
    }

    public static void shellSort(int[] a, int len, int gap) {
        if (gap < 1) return;

        for (int i = 0; i < len - gap; i++) {
            if (a[i] > a[i+gap]) SortCommon.swap(a, i, i+gap);
        }
        gap /=2;
        shellSort(a, len, gap);

    }
}
