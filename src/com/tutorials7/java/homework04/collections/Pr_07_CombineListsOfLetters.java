package com.tutorials7.java.homework04.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_07_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] l1Array = scanner.nextLine().toCharArray();
        ArrayList<Character> l1 = new ArrayList<>();

        for (int i = 0; i < l1Array.length; i++) {
            l1.add(l1Array[i]);
        }

        char[] l2Array = scanner.nextLine().toCharArray();
        ArrayList<Character> l2 = new ArrayList<>();

        for (int i = 0; i < l2Array.length; i++) {
            l2.add(l2Array[i]);
        }

        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (!l1.contains(l2.get(j))) {
                    l1.add(' ');
                    l1.add(l2.get(j));
                }
            }
        }

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
        }
    }
}
