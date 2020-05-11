package com.laraws.java.sorting;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class MergeSort {

    private static int[] b;

    public static void main(String[] args) {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = a.length;
        b = new int[len];
        sort(a, 0, len -1);
        System.out.println(Arrays.toString(a));

    }
    public static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid +1;
        for (int k = lo; k <= hi; k++) {
            b[k] = a[k];
        }


        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = b[j++];
            else if (j > hi) a[k] = b[i++];
            else if (less(b[i], b[j])) a[k] = b[i++];
            else a[k] = b[j++];
        }
    }

    public static boolean less (int i, int j) {
        return i <= j;
    }

}
