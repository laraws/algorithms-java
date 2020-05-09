package com.laraws.java.sorting;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = a.length;
        compare(a, len);
        System.out.println(Arrays.toString(a));
    }

    public static void compare(int[] a, int len) {
        for (int i = 1; i < len; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (a[j] < a[j - 1]) {
                    SortCommon.swap(a, j, j-1);
                } else if (a[j] >= a[j -1]) {
                    break;
                }
            }
        }
    }
}
