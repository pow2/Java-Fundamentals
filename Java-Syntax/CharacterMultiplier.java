package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 20.10.2015 y.
 *
 * Create a method that takes two strings as arguments and
 * returns the sum of their character codes multiplied
 * (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
 * Then continue with the next two characters.
 * If one of the strings is longer than the other,
 * add the remaining character codes to the total sum without multiplication.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input;
        input = line.split(" ");
        multiplying(input[0], input[1]);
        System.out.print(multiplying(input[0],input[1]));

    }
    private static Long multiplying(String first, String second) {
        Long sum =0L;
        if (first.length() < second.length()) {
            for (int i = 0; i < first.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
            for (int i = first.length(); i < second.length(); i++){
                sum += second.charAt(i);
            }
            return sum;
        }
        else if (first.length() > second.length()) {
            for (int i = 0; i < second.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
            for (int i = second.length(); i < first.length(); i++){
                sum += first.charAt(i);
            }
            return sum;
        }
        else {
            for (int i = 0; i < first.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
            return sum;
        }
    }
}
