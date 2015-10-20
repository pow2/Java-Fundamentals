package com.softuni2;

import java.util.Locale;
import java.util.Scanner;
import java.util.Formatter;
/**
 * Created by pow2 on 16.10.2015 y.
 *
 * Write a program that reads 3 numbers: an integer a (0 ? a ? 500),
 * a floating-point b and a floating-point c and prints them in 4 virtual columns on the console.
 * Each column should have a width of 10 characters. The number a should be printed in hexadecimal,
 * left aligned; then the number a should be printed in binary form, padded with zeroes,
 * then the number b should be printed with 2 digits after the decimal point, right aligned;
 * the number c should be printed with 3 digits after the decimal point, left aligned.
 *
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        Formatter formatter1 = new Formatter(sb1, Locale.US);
        StringBuilder sb2 = new StringBuilder();
        Formatter formatter2 = new Formatter(sb2, Locale.US);
        Scanner in = new Scanner(System.in);
        int a = 0;
        float b = 0f;
        float c = 0f;
        String hex = "";
        String binary = "";
        String[] input;
        System.out.println("Enter \"a b c\" where 'a' is int (0-500), b and c are floating-point values: ");
        String line = in.nextLine();
        try {
            input = line.split(" ");
            a = Integer.parseInt(input[0]);
            b = Float.parseFloat(input[1]);
            c = Float.parseFloat(input[2]);

            if (a>=0 && a<=500){
                hex = Integer.toHexString(a);
                binary = Integer.toBinaryString(a);
                while (hex.length() < 10){
                    hex = hex + " ";
                }
                while (binary.length() < 10){
                    binary = "0" + binary;
                }
            }
            String s3 = String.valueOf(formatter1.format("%1$.2f", b));
            while (s3.length() < 10){
                s3 = " "+s3;
            }
            String s4 = String.valueOf(formatter2.format("%1$.3f", c));
            while (s4.length() < 10){
                s4 = s4+" ";
            }
            System.out.println("|"+hex.toUpperCase()+"|"+binary+"|"+s3+"|"+s4+"|");
        } catch (Exception ex) {
            System.out.print("\nInvalid input\n");
        }


    }
}
