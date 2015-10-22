package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 16.10.2015 y.
 *
 * Write a method that returns the first N odd/even elements from a collection.
 * Return as many as you can
 * input example:
 * 2 8 11 15 3 2
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        String[] input;
        System.out.println("\nWrite \"x y z ...\" integers: ");

        try {
            line = in.nextLine();
            input = line.split(" ");
            int[] inNumbers = new int[input.length];
            for (int i = 0; i < input.length; i++){
                inNumbers[i] = Integer.parseInt(input[i]);
            }
            print(inNumbers);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    private static void print(int[] inNumbers){
        int i= 0;
        if (inNumbers.length%2 != 0){System.out.println("Invalid length");}
        else {
            while (i < inNumbers.length) {
                if ( inNumbers[i]%2 != 0 && inNumbers[i+1]%2 != 0) {System.out.println(inNumbers[i]+", "+inNumbers[i+1]+" -> both are odd");}
                else if ( inNumbers[i]%2 == 0 && inNumbers[i+1]%2 == 0) {System.out.println(inNumbers[i]+", "+inNumbers[i+1]+" -> both are even");}
                else {System.out.println(inNumbers[i]+", "+inNumbers[i+1]+" -> different");}
                i+=2;
            }
        }
    }

}
