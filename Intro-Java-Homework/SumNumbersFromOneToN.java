package com.softuni;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by pow2 on 15.10.2015 y..
 *
 * Create a Java program that reads a number N
 * from the console and calculates the sum of all
 * numbers from 1 to N (inclusive).
 */
public class SumNumbersFromOneToN {

    private void Print(int i){
        int k = i;
        for (int l=i-1; l > 0; l--)
        {
            k+=l;
        }
        System.out.print(k+"\n");
    }

    private void UI() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter N : ");
        String line = in.nextLine();
        System.out.print("\n");
        int result;
        try {
            result = Integer.parseInt(line);
        } catch (NumberFormatException ex) {
            result = 0;
        }
        Print(result);
    }

    public void Start() throws IOException {
        this.UI();
    }
}
