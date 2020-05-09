package com.laraws.java.algs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScanner {
    public static int[] getInputArr(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(args[0]));
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
