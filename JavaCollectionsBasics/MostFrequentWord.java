package com.softuni4;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to find the most frequent word in a text and print it,
 * as well as how many times it appears in format "word -> count".
 * Consider any non-letter character as a word separator.
 * Ignore the character casing.
 * If several words have the same maximal frequency,
 * print all of them in alphabetical order.
 *
 * Examples:
 * in the middle of the night
 * Output:
 * the -> 2 times
 */
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String,Integer> stringTreeMap = new TreeMap<>();
        String input = in.nextLine().toLowerCase();
        Pattern word = Pattern.compile("\\b([a-z]+)\\b");
        Matcher matcher = word.matcher(input);


        while(matcher.find()) {
            if(stringTreeMap.containsKey(matcher.group(1))){
                stringTreeMap.put(matcher.group(1),stringTreeMap.get(matcher.group(1))+1);
            }
            else{
                stringTreeMap.put(matcher.group(1),1);
            }
        }

        Integer maxLength = stringTreeMap.values().stream().max(Integer::compare).get();

        for(String key : stringTreeMap.keySet()){
            if(stringTreeMap.get(key) == maxLength){
                System.out.println(key + " -> " + maxLength + "times");
            }
        }
    }
}
