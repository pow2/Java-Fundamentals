package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 20.10.2015 y.
 *
 * Write a program that converts from a base-7 number to its decimal representation
 */
public class ConvertFromBase7ToDecimalSystem {

    public static void main(String[] args) {
        System.out.println("This program takes an base-7 number and converts it to decimal");
        Scanner in = new Scanner(System.in);
        int a;
        int err = 0;
        do {
            System.out.print("\nEnter \"a\": ");
            String line = in.nextLine();
            try {
                a = Integer.parseInt(line, 7);
                System.out.println(Integer.toString(a, 10));
            } catch (Exception ex) {
                System.out.println("Invalid input\n");
                err = 1;
            }
        } while (err==0);
    }
}
