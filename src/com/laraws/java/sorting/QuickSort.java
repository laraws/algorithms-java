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
        compare(a, 0, len - 1);
        System.out.println(Arrays.toString(a));
    }

    /**
     * Quicksort made by laraws
     * The performance is bad
     * @param a
     * @param lo
     * @param hi
     */
    public static void compare(int[] a, int lo, int hi) {
//        if (lo > 0) {
//            System.out.println("Right");
//        }
        if (hi <= lo) return;
//        System.out.println("lo = "+lo+", hi = "+hi);
//        System.out.println("a[lo]= "+a[lo]+", a[hi]= "+hi);
//        System.out.println("before: ");
//        System.out.println(Arrays.toString(a));
        int p = lo;
        for (int i = lo + 1; i <= hi; i++) {
            if (a[p] > a[i]) {
                int temp = a[i];
                for (int j = i; j > lo; j--) {
                    a[j] = a[j - 1];
                }
                p++;
                a[0] = temp;
            }
        }
//        System.out.println("after: ");
//        System.out.println(Arrays.toString(a));
        compare(a, 0, p);
        compare(a, p + 1, hi);


    }
}
