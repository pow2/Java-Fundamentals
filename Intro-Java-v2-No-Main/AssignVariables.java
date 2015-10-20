package com.softuniv2;

/**
 * Created by pow2 on 15.10.2015 y.
 *
 * Find suitable types for variables.
 * You are given the following types:
 * byte, short, int, long, char, boolean, float, double, and String.
 * Assign the following values to them
 * false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
 * Try to assign 32768 to short and see what happens.
 */
public class AssignVariables {

    private static void print() {
        boolean boolean1 = false;
        String name1 = "Palo Alto, CA";
        int int1 = 32767;
        long long1 = 2000000000;
        double double1 = 0.1234567891011;
        float float1 = 0.5f;
        long long2 = 919827112351L;
        short short1 = 127;
        char char1 = 'c';
        short short2;
        System.out.println("this is boolean false : " + boolean1);
        System.out.println("this is String \"Palo Alto, CA\" : " + name1);
        System.out.println("this is int 32767 : " + int1);
        System.out.println("this is long 2000000000 : " + long1);
        System.out.println("this is double 0.1234567891011 : " + double1);
        System.out.println("this is float 0.5f : " + float1);
        System.out.println("this is long 919827112351L : " + long2);
        System.out.println("this is short 127 : " + short1);
        System.out.println("this is char 'c' : " + char1);
        try {
            short2 = Short.parseShort("32768");
            System.out.println("this is short 32768 : " + short2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        print();
    }
}
