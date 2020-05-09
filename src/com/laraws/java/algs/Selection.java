package com.laraws.java.algs;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) throws FileNotFoundException {
        int[] a = FileScanner.getInputArr(args);
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
            swap(b, i, min);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
