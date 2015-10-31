package com.softuni4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to count the number of words in given sentence.
 * Use any non-letter character as word separator
 *
 * Example:
 * I am coming...
 *
 * Output:
 * 3
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Pattern word = Pattern.compile("[A-Za-z]+");
        Matcher matcher = word.matcher(line);
        int br=0;
        while (matcher.find()) {
            br+=1;
        }
        System.out.print(br);
    }
}
