package com.softuni4;

import java.util.Scanner;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program that enters an array of strings
 * and finds in it all sequences of equal elements.
 * The input strings are given as a single line,
 * separated by a space.
 *
 * Example:
 * hi yes yes yes bye
 *
 * Output:
 * hi
 * yes yes yes
 * bye
 *
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input = line.split(" ");
        System.out.print(input[0]+" ");
            for (int i=0; i<input.length-1; i++){
                if (input[i].equals(input[i+1])){
                    System.out.print(input[i+1]+" ");
                }
                else {System.out.print("\n"+input[i+1]+" ");}
            }
    }
}
