package com.tutorials7.java.homework04.collections;

import java.util.Scanner;

public class Pr_05_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("( )|(')|(\\-)");

        System.out.println(array.length);
    }
}