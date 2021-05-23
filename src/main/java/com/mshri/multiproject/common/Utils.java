package com.mshri.multiproject.common;

import java.util.Scanner;

public class Utils {
    public static void firstUtilFunc() {
        System.out.println("firstUtilFunc() ran.");
    }

    public static void pack(String article) {
        System.out.println(article + " packed.");
    }

    public static String readConsole() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input;
    }

    public static void holdConsole() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
    }
}
