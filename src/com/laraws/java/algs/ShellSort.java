package com.laraws.java.algs;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args)  {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = a.length;
        shellSort(a, len);
        System.out.println(Arrays.toString(a));
    }

    public static void shellSort(int[] a, int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}
