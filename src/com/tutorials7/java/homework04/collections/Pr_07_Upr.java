package com.tutorials7.java.homework04.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Pr_07_Upr {

    public static String modifyString(String s, Function<String, String> function) {
        return function.apply(s);
    }

    public static void main(String[] args) {
        String hardUni = modifyString("SoftUni", s -> s.replace("Soft", "Hard"));
        System.out.println(hardUni);
        String soft = modifyString("SoftUni", s -> s.substring(0, 4));
        System.out.println(soft);
        String uppercased = modifyString("SoftUni", String::toUpperCase);
        System.out.println(uppercased);
    }
}
