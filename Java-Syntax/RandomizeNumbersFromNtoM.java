package com.softuni2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by pow2 on 16.10.2015 y.
 *
 * Write a program that takes as input two integers N and M,
 * and randomizes the numbers between them. Note that M may be smaller than or equal to N
 */
public class RandomizeNumbersFromNtoM {

    private static int[] shuffle(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    private static String arrBuilder (int n, int m){
        if (n == m) {
            return Integer.toString(n);
        }
            else if (n > m) {
            int y;
            y = n;
            n = m;
            m = y;
        }
        int[] anArray = new int[m-n+1];
        int l=0;
        for (int i = n; i <= m; i++){
            anArray[l] = i;
            l++;
        }
        String send = "";
        anArray = shuffle(anArray);
        for (int i=0; i<anArray.length; i++){
            send += anArray[i]+" ";
        }
        return send;
    }

    public static void main(String[] args) {
        System.out.print("\nWrite \"N M\" integers: ");
        Scanner in = new Scanner(System.in);
        int n = 0; int m = 0;
        String[] input;
        String line = in.nextLine();
        try {
            input = line.split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);
            System.out.println(arrBuilder(n, m));
        } catch (Exception ex) {
            System.out.print("\nInvalid input\n");
        }
    }
}
