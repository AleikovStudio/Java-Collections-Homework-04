package com.tutorials7.java.homework04.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Pr_08_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().toLowerCase().split("\\W+");//READ MORE ABOUT \\W+ HERE: http://stackoverflow.com/questions/9760909/split-string-with-regex-w-w-w
        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!treeSet.contains(array[i])) {
                treeSet.add(array[i]);
            }
        }

        for (String listEl : treeSet) {
            System.out.print(listEl + " ");
        }
    }
}
