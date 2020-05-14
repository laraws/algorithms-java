package com.laraws.java.sorting;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = a.length;
        sort(a, len);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int n) {
        for (int k = n / 2; k >= 1; k--) {
            sink(a, k, n);
        }
        while (n > 1) {
            SortCommon.swap(a, 0, (n--) - 1);
            sink(a, 1, n);
        }
    }

    public static void sink(int[] a, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            if ( j < n && a[j - 1] < a[j]) j++;
            if (a[k-1] < a[j-1]) {
                SortCommon.swap(a, k-1, j-1);
                k = j;
            } else {
                break;
            }
        }
    }
}
