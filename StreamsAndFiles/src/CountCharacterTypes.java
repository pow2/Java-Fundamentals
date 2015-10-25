package com.softuni3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pow2 on 22.10.2015 y.
 *
 * Write a program that reads a list of words from the file words.txt
 * and finds the count of vowels, consonants
 * and other punctuation marks. Since English is a bit tricky,
 * assume that a, e, i, o, u are vowels and all others are consonants.
 * Punctuation marks are (!,.?). Do not count whitespace.
 * Write the results in file count-chars.txt
 */
public class CountCharacterTypes {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader( new FileReader("res/words.txt"))){
            String inputLine;
            Pattern vowels = Pattern.compile("[AEIOUaeiou]");
            Pattern consonants = Pattern.compile("[B-DF-HJ-NP-TV-Zb-df-hj-np-tv-z]");
            Pattern punctuation = Pattern.compile("[!,.?]");
            Matcher matcher;
            int cVol = 0;
            int cConsonants = 0;
            int cPunctuation = 0;
            while((inputLine = bfr.readLine())!=null) {
                matcher = vowels.matcher(inputLine);
                while (matcher.find()) {
                    cVol+=1;
                }
                matcher = consonants.matcher(inputLine);
                while (matcher.find()) {
                    cConsonants+=1;
                }
                matcher = punctuation.matcher(inputLine);
                while (matcher.find()){
                    cPunctuation+=1;
                }

            }

            //System.out.printf("\nVowels: %d\nConsonants: %d\nPunctuation: %d", cVol, cConsonants, cPunctuation);
            PrintWriter pW = new PrintWriter( new BufferedWriter(new FileWriter("res/count-chars.txt")));
            pW.write(String.format("Vowels: %d\nConsonants: %d\nPunctuation: %d", cVol, cConsonants, cPunctuation));
            pW.close();
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
