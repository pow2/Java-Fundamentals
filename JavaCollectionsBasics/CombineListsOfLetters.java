package com.softuni4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pow2 on 27.10.2015 y.
 *
 * Write a program that reads two lists of letters l1 and l2 and combines them:
 * appends all letters c from l2 to the end of l1, but only when c does not appear in l1.
 * Print the obtained combined list.
 * All lists are given as sequence of letters separated by a single space, each at a separate line.
 * Use ArrayList<Character> of chars to keep the input and output lists.
 *
 * Examples:
 * h e l l o
 * l o w
 *
 * Output:
 * h e l l o w
 */

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        ArrayList<Character> aL1 = new ArrayList(Arrays.asList(line1.split(" ")));
        ArrayList<Character> aL2 = new ArrayList(Arrays.asList(line2.split(" ")));

        for (int i = 0; i < aL2.size(); i++) {
            if(!aL1.contains(aL2.get(i))){
                aL1.add(aL2.get(i));
            }
        }
        for (int i = 0; i < aL1.size(); i++) {
            System.out.print(aL1.get(i) + " ");
        }

    }
}
