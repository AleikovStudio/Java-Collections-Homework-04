package com.tutorials7.java.homework04.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Pr_09_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.next().toLowerCase().split("\\W+");

        HashMap<String,Integer> wordOcc = new HashMap<>();

        int counterMax = 0;

        for (String word: words) {
            Integer wordCounter = wordOcc.get(word);
            if(wordCounter==null){
                wordCounter=0;
            }
            if(wordCounter+1>counterMax) counterMax=wordCounter+1;
            wordOcc.put(word,wordCounter+1);
        }


    }
}
