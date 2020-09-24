package com.zadoiko.homework._02;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter weight--->");
        double w=s.nextDouble();//weight
        System.out.println("Enter height--->");
        double h= s.nextDouble();//height
        double bmi= w/(h*h);//body mass index
        if   (bmi<= 18.5) System.out.println("Underweight");
        else if (bmi<=25.0) System.out.println("Normal");
        else if (bmi<=30.0) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
