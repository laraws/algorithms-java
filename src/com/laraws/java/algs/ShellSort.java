package com.laraws.java.algs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) throws FileNotFoundException {
        int[] a = FileScanner.getInputArr(args);
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
