package com.softuni4;

import java.util.Scanner;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program that recursively calculates factorial.
 *
 * Input:
 * 5
 *
 * Output:
 * 120
 */
public class CalculateNFact {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long n = console.nextLong();
        if (n >= 0){
            System.out.println(fact(n));
        }
        else {
            System.out.println("Impossible");
        }
    }

    public static long fact (long n){
        if ( n == 0 ) return 1;
        if ( n == 1 ) return 1;
        return fact(n-1) * n;
    }

}
