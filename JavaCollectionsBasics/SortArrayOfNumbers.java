package com.softuni4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program to enter a number n and n
 * integer numbers and sort and print them.
 * Keep the numbers in array of integers: int[].
 *
 * Example:
 * 7
 * 6 5 4 10 -3 120 4
 *
 * Output:
 * -3 4 4 5 6 10 120
 */
public class SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}
