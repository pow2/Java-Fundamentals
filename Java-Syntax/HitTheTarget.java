package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 16.10.2015 y.
 *
 *Write a program that takes as input an integer – the target –
 * and outputs to the console all pairs of numbers between 1 and 20, which,
 * if added or subtracted, result in the target.
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter valid integer [1-40]: ");
        String line = in.nextLine();
        try {
            a = Integer.parseInt(line);
            ht20(a);
        } catch (Exception ex) {
            System.out.println("Invalid input");
        }
    }

    private static void ht20 (int a){
        if(a<1 || a>40){System.out.println("Invalid input");}
        else {
            for (int i = 1; i <= 20; i++) {
                for (int y = 1; y <= 20; y++) {
                    if (i + y == a) {
                        System.out.println(i + " + " + y + " = " + a);
                    }
                }
            }
            for (int i = 1; i <= 20; i++) {
                for (int y = 1; y <= 20; y++) {
                    if (i - y == a) {
                        System.out.println(i + " - " + y + " = " + a);
                    }
                }
            }
        }
    }
}
