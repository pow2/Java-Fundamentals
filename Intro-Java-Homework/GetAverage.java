package com.softuni;

import java.util.Scanner;

/**
 * Created by pow2 on 15.10.2015 y.
 *
 * Create a method that finds the average of three numbers.
 * Read in internet about java methods.
 * Check the naming conventions.
 * Invoke your method and test it.
 * Format the output to two digits after the decimal separator.
 * The placeholder is %.2f
 *
 */
public class GetAverage {

 private float avg3(float a, float b, float c){

     return (a+b+c)/3;
 }

    private void uI() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter \"a b c\" : ");
        String line = in.nextLine();
        System.out.print("\n");
        String[] st= line.split(" ");
        try {
            float avg = avg3(Float.parseFloat(st[0]), Float.parseFloat(st[1]), Float.parseFloat(st[2]));
            System.out.printf("The average value is : %1$.2f", avg);
            System.out.printf("\n");
        } catch (Exception e){
            System.out.println(e + "\n");
        }
    }

    public void start() {
        this.uI();
    }

}
