package com.tutorials7.java.homework04.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (!list2.contains(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    list.clear();
                    list.add(array[i]);
                }
                count = 0;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(list.get(0) + " ");
        }
    }
}