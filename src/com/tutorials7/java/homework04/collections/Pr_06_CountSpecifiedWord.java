package com.tutorials7.java.homework04.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_06_CountSpecifiedWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] firstIn = scanner.nextLine().toLowerCase().split("((\\s+)|('))");//EMPTY SPACES + APOSTROPHE
        String secondIn = scanner.nextLine().toLowerCase();//THE SECOND INPUT IS LOWER CASE AS WELL - SO BOTH CAN MATCH

        int counter = 0;
        for (int i = 0; i < firstIn.length; i++) {
            if (firstIn[i].equals(secondIn)) {//IT IS BETTER TO USE .equals then == !!! WHEN COMPARING STRINGS
                counter++;
            }
        }
        System.out.println(counter);
    }
}