package com.tutorials7.java.homework04.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int[] array = new int[input.length];
        ArrayList<Integer> longestList = new ArrayList<>();
        ArrayList<Integer> currentList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                if (array[i - 1] < array[i]) {
                    System.out.print(array[i]);
                    currentList.add(array[i]);
                    if (currentList.size() > longestList.size()) {
                        longestList = currentList;
                    }
                } else {
                    System.out.print(array[i]);
                    if (currentList.size() > longestList.size()) {
                        longestList = currentList;
                    }
                    currentList.clear();
                    currentList.add(array[i]);
                }
            } else if (array[i] < array[i + 1]) {
                System.out.print(array[i] + " ");
                currentList.add(array[i]);
            } else {
                System.out.println(array[i]);
                if (currentList.size() > longestList.size()) {
                    longestList = currentList;
                }
                currentList.clear();
            }
        }
        System.out.printf("\r\nLongest: ");
        for (int i = 0; i < longestList.size(); i++) {
            System.out.print(longestList.get(i) + " ");
        }
    }
}
