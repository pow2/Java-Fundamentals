package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 20.10.2015 y.
 *
 * pow(((a2 + b2) / (a2 – b2)),(a + b + c)) / √c             pow((a2 + b2 - c3),(a – b))
 * Average (a, b, c) – Average (f1, f2)
 */
public class CalculateExpression {

    private static void Calc(float a, float b, float c){
        double f2;
        double f1 = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), (a + b + c) / Math.sqrt(c));
        if (a-b > 0) { f2 = Math.pow( (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)), (a - b)); }
            else if (a-b < 0){ f2 = 1 / (Math.pow( (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)), Math.abs(a - b)));}
                else f2 = 1;
        double f3 = (a+b+c)/3-(f1+f2)/2;
        System.out.printf("\nF1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", f1, f2, f3);
    }

    public static void main(String[] args) {
        float a = 0f;
        float b = 0f;
        float c = 0f;
        String[] input;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter \"a b c\" (floating-point values): ");
        String line = in.nextLine();
        try {
            input = line.split(" ");
            a = Float.parseFloat(input[0]);
            b = Float.parseFloat(input[1]);
            c = Float.parseFloat(input[2]);
            Calc(a,b,c);
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
