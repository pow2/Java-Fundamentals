package com.softuni3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Created by pow2 on 22.10.2015 y.
 *
 * Write a program that reads a text file and prints on the console
 * the sum of the ASCII symbols of each of its lines.
 * Use BufferedReader in combination with FileReader.
 */
public class SumLines {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader( new FileReader("res/lines.txt"))){
            String inputLine;
            while((inputLine = bfr.readLine())!=null) {
                int sum = 0;
                for (int i = 0; i < inputLine.length(); i++) {
                    sum += inputLine.charAt(i);
                }
                System.out.println(sum);
            }
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
