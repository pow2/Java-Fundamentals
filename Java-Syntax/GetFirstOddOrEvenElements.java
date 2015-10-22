package com.softuni2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pow2 on 16.10.2015 y.
 *
 * Write a method that returns the first N odd/even elements from a collection.
 * Return as many as you can
 * input example:
 * 1 2 3 4 5
 * Get 3 odd
 */
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        String[] inputNumbers;
        String[] inputCondition;
        List<Integer> cNumbers = new ArrayList<>();
        System.out.println("\nWrite \"x y z ...\" integers: ");
        try {
            line = in.nextLine();
            inputNumbers = line.split(" ");
            line = in.nextLine();
            inputCondition = line.split(" ");
            for (int i = 0; i < inputNumbers.length; i++) {
                cNumbers.add(Integer.parseInt(inputNumbers[i]));
            }
            print(condition(inputCondition[2]), Integer.parseInt(inputCondition[1]), cNumbers);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    private static int condition(String cond){
        if (cond.equals("even")) {
            return 2;
        }
        else if (cond.equals("odd")){
            return 1;
        }
        else return 0;
    }

    private static void print(int type, int firstN,  List<Integer> cNumbers){
        int br=0;
        if (type == 1) {
            for (int i = 0; i < cNumbers.size(); i++) {
                if (cNumbers.get(i) % 2 != 0) {
                    System.out.print(cNumbers.get(i) + " ");
                    br++;
                }
                if (br >= firstN) {
                    break;
                }
            }
        }
        else if (type == 2) {
            for (int i = 0; i < cNumbers.size(); i++) {
                if (cNumbers.get(i) % 2 == 0) {
                    System.out.print(cNumbers.get(i) + " ");
                    br++;
                }
                if (br >= firstN) {
                    break;
                }
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

}
