package com.laraws.java.sorting;

import java.io.*;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = new int[0];
        try {
            a = SortCommon.getInputArr(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        compare(a);
        System.out.println(Arrays.toString(a));
    }

    public static void compare(int[] b) {
        int len = b.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (b[min] > b[j]) {
                    min = j;
                }
            }
            SortCommon.swap(b, i, min);
        }
    }


}
