package com.zadoiko.homework._02;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int age= s.nextInt();
        if (age<=12) System.out.print("You're a kid");
        else if (age>=13 && age<=17) System.out.print("You're a teenager");
        else if (age>=18 && age<=64) System.out.print("You're an adult");
        else System.out.print("You're an elderly");
    }
}
