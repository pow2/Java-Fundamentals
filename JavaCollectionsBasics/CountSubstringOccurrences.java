package com.softuni4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to find how many times given string appears in given text as substring.
 * The text is given at the first input line.
 * The search string is given at the second input line.
 * The output is an integer number. Please ignore the character casing
 *
 * Example:
 * Welcome to the Software University (SoftUni)! Welcome to programming. Programming is wellness for developers, said Maxwell.
 * wel
 *
 * Output:
 * 4
 *
 * Example2:
 * aaaaaa
 * aa
 *
 * Output2:
 * 5
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine().toLowerCase();
        String line2 = in.nextLine().toLowerCase();
        int br = 0;
        Pattern word = Pattern.compile(line2);
        Matcher matcher;
        try{
        for(int i = 0; i <= line1.length()-line2.length(); i++) {
                matcher= word.matcher(line1.substring(i,i+line2.length()));
                if ( matcher.matches() ) {
                    br += 1;
                }
        }
        System.out.print(br);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
