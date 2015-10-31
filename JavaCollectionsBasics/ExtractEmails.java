package com.softuni4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to extract all email addresses from given text.
 * The text comes at the first input line.
 * Print the emails in the output, each at a separate line.
 * Emails are considered to be in format <user>@<host>,
 *
 * Example:
 * Please contact us at: support@github.com.
 *
 * Output:
 * support@github.com
 */
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Pattern word = Pattern.compile("[A-Za-z0-9]+[A-Za-z0-9.-_][A-Za-z0-9]+@[A-Za-z0-9-]{2,}.[A-Za-z0-9]+[A-Za-z0-9-.][A-Za-z0-9]+");
        Matcher matcher = word.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group()+" ");
        }
    }
}
