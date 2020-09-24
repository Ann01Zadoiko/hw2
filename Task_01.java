package com.zadoiko.homework._02;

import java.util.Scanner;

public class Task_01 {
    private static double liters (double time)
    {
        return  ((int) time*0.5);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("time=");
        double time = s.nextDouble();
        System.out.println("---> litres "+liters(time));
    }
}
