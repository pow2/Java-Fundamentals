package com.softuni4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * At the first line at the console you are given a piece of text.
 * Extract all words from it and print them in alphabetical order.
 * Consider each non-letter character as word separator.
 * Take the repeating words only once. Ignore the character casing.
 * Print the result words in a single line, separated by spaces.
 *
 * Examples:
 * Welcome to SoftUni. Welcome to Java.
 * Output:
 * java to softuni welcome
 */

public class ExtractAllUniqueWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern word =  Pattern.compile("\\b([a-z]+)\\b");

        String line = in.nextLine().toLowerCase();
        Matcher wordMatcher = word.matcher(line);
        HashSet<String> uniqueHashSet = new HashSet<>();

        while(wordMatcher.find()){
            uniqueHashSet.add(wordMatcher.group());
        }

        ArrayList<String> uniqueAList = new ArrayList<>(uniqueHashSet);
        Collections.sort(uniqueAList);

        for ( String w : uniqueAList ){
            System.out.print(w + " ");
        }
    }
}
