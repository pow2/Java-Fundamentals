package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 20.10.2015 y.
 *
 * Write a program that takes an integer number and converts it to base-7
 */
public class ConvertFromDecimalSystemToBase7 {

    public static void main(String[] args) {
        System.out.println("This program takes an integer number and converts it to base-7");
        Scanner in = new Scanner(System.in);
        int a;
        int err = 0;
        do {
            System.out.print("\nEnter \"a\": ");
            String line = in.nextLine();
            try {
                a = Integer.parseInt(line, 10);
                System.out.println(Integer.toString(a, 7));
            } catch (Exception ex) {
                System.out.println("Invalid input\n");
                err = 1;
            }
        } while (err==0);
    }
}
