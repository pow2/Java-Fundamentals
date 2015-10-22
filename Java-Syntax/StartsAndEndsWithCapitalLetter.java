package com.softuni2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 16.10.2015 y.
 *
 * Write a program that takes as input an array of strings
 * are prints only the words that start and end with capital letter.
 * Words are only strings that consist of English alphabet letters.
 * Use regex.
 */
public class StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {
        System.out.println("This program prints only the words that start and end with capital letter");
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String line = in.nextLine();
        Pattern word = Pattern.compile("(\\b|\\n)[A-Z]+[A-Za-z]*[A-Z]+\\b");
        Matcher matcher = word.matcher(line);
        while (matcher.find()) {
            System.out.print(matcher.group()+" ");
        }
    }
}
