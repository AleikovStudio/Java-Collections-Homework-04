package com.tutorials7.java.homework04.collections;


import java.util.ArrayList;
import java.util.Scanner;

public class Pr_02_SequencesOfEqualStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
                for (int j = 0; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
