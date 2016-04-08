package com.tutorials7.java.homework04.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Pr_01_SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Printing with foreach:");
        for (Integer number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("*********************************");

        System.out.println("Printing with for:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}