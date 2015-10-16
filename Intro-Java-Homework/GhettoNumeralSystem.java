package com.softuni;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by pow2 on 15.10.2015 y.
 *
 *  Write a program that converts the decimal number system to the ghetto numeral system.
 *  In the ghetto, numbers are represented as following:
 *	0 – Gee
 *	1 – Bro
 *	2 – Zuz
 *	3 – Ma
 *	4 – Duh
 *	5  - Yo
 *	6 – Dis
 *	7 – Hood
 *	8 – Jam
 *	9 – Mack
 */
public class GhettoNumeralSystem {

    private void Print (String l){
        char[] k = l.toCharArray();
        String p = "";
        for (int i = 0; i<=(k.length-1); i++){
            if (k[i] == '0') {
                p += "Gee";
            }
            else if (k[i] == '1') {
                p += "Bro";
            }
            else if (k[i] == '2') {
                p += "Zuz";
            }
            else if (k[i] == '3') {
                p += "Ma";
            }
            else if (k[i] == '4') {
                p += "Duh";
            }
            else if (k[i] == '5') {
                p += "Yo";
            }
            else if (k[i] == '6') {
                p += "Dis";
            }
            else if (k[i] == '7') {
                p += "Hood";
            }
            else if (k[i] == '8') {
                p += "Jam";
            }
            else if (k[i] == '9') {
                p += "Mack";
            }
            else {
                p = "Unexpected Symbols";
            }
        }
        System.out.println(p);
    }

    private void UI() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter your ghetto shenanigans : ");
        String line = in.nextLine();
        System.out.print("\n");
        Print(line);
    }
    public void Start() throws IOException {
        this.UI();
    }

}
