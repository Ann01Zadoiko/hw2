package com.zadoiko.homework._02;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year->");
        int year = s.nextInt();
        if (year <= 100) System.out.print("1st century");
        else if (year % 10 == 0) System.out.print(year / 100 + "century");
        else System.out.print(year / 100 + 1 + "century");
    }
}
