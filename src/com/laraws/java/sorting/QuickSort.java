package com.laraws.java.sorting;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = a.length;
        sort(a, 0, len - 1);
        System.out.println(Arrays.toString(a));
    }

    /**
     * Quicksort reference to book
     * @param a
     * @param lo
     * @param hi
     */
    public static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int i = lo;
        int j = hi + 1;
//        System.out.println("lo= "+lo+", hi= "+hi);
        while(true) {
            while (a[++i] <= a[lo]) {
                if (i == hi) break;
            }
            while (a[--j] >= a[lo]) {
                if (j == lo) break;
            }
            if (i >= j) break;
            SortCommon.swap(a, i, j);

        }
        SortCommon.swap(a, j, lo);
        sort(a, 0, j-1);
        sort(a, j+1, hi);
    }
}
