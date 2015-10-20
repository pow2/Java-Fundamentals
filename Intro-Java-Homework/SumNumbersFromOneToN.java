package com.softuni;

import java.util.Scanner;

/**
 * Created by pow2 on 15.10.2015 y..
 *
 * Create a Java program that reads a number N
 * from the console and calculates the sum of all
 * numbers from 1 to N (inclusive).
 */
public class SumNumbersFromOneToN {

    private void print(int i){
        int k = i;
        for (int l=i-1; l > 0; l--)
        {
            k+=l;
        }
        System.out.print(k+"\n");
    }

    private void uI() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter N : ");
        String line = in.nextLine();
        System.out.print("\n");
        int result;
        try {
            result = Integer.parseInt(line);
            print(result);
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect input");
        }

    }

    public void start() {
        this.uI();
    }
}
