package com.softuni;

/**
 * Created by pow2 on 15.10.2015 y..
 *
 * Print the characters from ‘a’ to ‘z’ on the console on a single line, separated by a space.
 * Use a for-loop.
 * Note: you can directly declare and increment char in the for-loop. for (char c = ‘a’; …)
 */
public class PrintCharacters {
    private void print(){
        for (char c = 'a'; c <= 'z'; c++)
        {
            System.out.print(c+" ");
        }
        System.out.print("\n");
    }
    public void start() {
        this.print();
    }
}
