package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 16.10.2015 y.
 * 
 * Write a program that enters the sides of
 * a rectangle (two integers a and b) and
 * calculates and prints the rectangle's area.
 */
public class RectangleArea {

    private static int CalcArea (int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.print("\nThis program takes both sides of rectangle as parameters and calculates it's area");
        Scanner in = new Scanner(System.in);
        int a = 0; int b = 0;
        String[] input;
        System.out.print("\nEnter \"a b\":");
        String line = in.nextLine();
        try {
            input = line.split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            System.out.print("The area is: " + CalcArea(a, b));
        } catch (Exception ex) {
            System.out.print("\nInvalid input\n");
        }
    }
}
