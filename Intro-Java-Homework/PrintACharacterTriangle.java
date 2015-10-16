package com.softuni;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by xxxxxxxxxx on 15.10.2015 y..
 *
 */
public class PrintACharacterTriangle {

    private void PrintSingleLine(int i){
        for (char c = 'a'; c <= i + 96; c++)
        {
            System.out.print(c+" ");
        }
    }
    private void Print(int k){
        if (k<1 || k>26) System.out.print("Incorrect Input\n");
        else {
            for (int i = 1; i <= k; i++) {
                PrintSingleLine(i);
                System.out.print("\n");
            }
            for (int i = k - 1; i >= 1; i--) {
                PrintSingleLine(i);
                System.out.print("\n");
            }
        }
    }
    private void UI() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("\nHow much characters do you want to print : ");
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
