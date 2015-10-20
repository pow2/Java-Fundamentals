package com.softuniv2;

import java.util.Scanner;

/**
 * Created by pow2 on 15.10.2015 y.
 *
 * Create a triangle of characters, based on input.
 * Learn about java.util.Scanner and Integer.parseInt ().
 * Test your program with integers up to 26.
 * Think why
 */
public class PrintACharacterTriangle {

    private static void printSingleLine(int i){
        for (char c = 'a'; c <= i + 96; c++)
        {
            System.out.print(c+" ");
        }
    }
    private static void print(int k){
        if (k<1 || k>26) System.out.print("Incorrect Input\n");
        else {
            for (int i = 1; i <= k; i++) {
                printSingleLine(i);
                System.out.print("\n");
            }
            for (int i = k - 1; i >= 1; i--) {
                printSingleLine(i);
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nHow much characters do you want to print : ");
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
}
