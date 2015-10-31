package com.softuni4;

import java.util.Scanner;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program that enters an array of strings and
 * finds in it the largest sequence of equal elements.
 * If several sequences have the same longest length, print the leftmost of them.
 * The input strings are given as a single line, separated by a space.
 *
 * Example:
 * hi yes yes yes bye
 *
 * Output:
 * yes yes yes
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        try {
            String[] input = line.split(" ");
            if(input.length == 1){System.out.print(input[0]);}
            else {
                int where = 0;
                int longest = 1;
                int br = 1;

                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i].equals(input[i + 1])) {
                        br += 1;
                        if (longest < br) {
                            longest = br;
                            where = i-longest+2;
                        }
                    } else {
                        br = 1;
                    }
                }
                for (int i = where; i < where+longest; i++) {
                    System.out.print(input[i] + " ");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
