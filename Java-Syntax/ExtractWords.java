package com.softuni2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 20.10.2015 y.
 *
 * Write a program that extracts words from a string.
 * Words are sequences of characters that are at least
 * two symbols long and consist only of English alphabet letters.
 * Use regex.
 */
public class ExtractWords {
    public static void main(String[] args) {
        System.out.println("This program extracts words from a string");
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String line = in.nextLine();
        Pattern word = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcher = word.matcher(line);
        while (matcher.find()) {
            System.out.print(matcher.group()+" ");
        }
    }
}
