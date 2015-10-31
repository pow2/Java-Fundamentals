package com.softuni4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to find how many times a word appears in given text.
 * The text is given at the first input line.
 * The target word is given at the second input line.
 * The output is an integer number.
 * Please ignore the character casing.
 * Consider that any non-letter character is a word separator.
 *
 * Example:
 * It's OK, I'm in.
 * hello
 *
 * Ouput:
 * 0
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine().toLowerCase();
        String line2 = in.nextLine().toLowerCase();
        String regex = "\\b"+line2+"\\b";
        Pattern word = Pattern.compile(regex);
        Matcher matcher = word.matcher(line1);
        int br=0;
        while (matcher.find()) {
            br+=1;
        }
        System.out.print(br);
    }
}
