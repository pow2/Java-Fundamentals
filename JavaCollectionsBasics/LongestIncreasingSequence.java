package com.softuni4;

import java.util.Scanner;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to find all increasing sequences inside an array of integers.
 * The integers are given in a single line, separated by a space.
 * Print the sequences in the order of their appearance in the input array, each at a single line.
 * Separate the sequence elements by a space.
 * Find also the longest increasing sequence and print it at the last line.
 * If several sequences have the same longest length, print the leftmost of them.
 *
 * Example:
 * 5 -1 10 20 3 4
 *
 * Output:
 * 5
 * -1 10 20
 * 3 4
 * Longest: -1 10 20
 */
public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int where = 0;
        int longest = 1;
        int br = 1;
        try {
            String[] input = line.split(" ");

                System.out.printf(input[0] + " ");
                for (int i = 0; i < input.length - 1; i++) {
                    if (Integer.parseInt(input[i]) < Integer.parseInt(input[i+1])) {
                        System.out.print(input[i+1]+" ");
                        br += 1;
                        if (longest < br) {
                            longest = br;
                            where = i-longest+2;
                        }
                    } else {
                        System.out.printf("\n"+input[i+1]+" ");
                        br = 1;
                    }
                }
                System.out.printf("\nLongest: ");
                for (int i = where; i < where+longest; i++) {
                    System.out.printf(input[i] + " ");
                }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
