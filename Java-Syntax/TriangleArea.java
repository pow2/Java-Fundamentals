package com.softuni2;

import java.util.Scanner;

/**
 * Created by pow2 on 16.10.2015 y.
 *
 * Enters 3 points in the plane (as integer x and y coordinates),
 * calculates and prints the area of the triangle composed by these 3 points
 */
public class TriangleArea {

    private static int Area (int ax, int ay, int bx, int by, int cx, int cy){
        return Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2 );
    }

    public static void main(String[] args) {
    System.out.println("3 points in the plane (as integer x and y coordinates)");
    Scanner in = new Scanner(System.in);
        int x1 = 0;
        int y1 = 0; int x2 = 0; int y2 = 0; int x3 = 0; int y3 = 0;
    String[] input;
        try {
            System.out.println("Enter \"x1 y1\" for the first point: ");
            String line = in.nextLine();
            input = line.split(" ");
            x1 = Integer.parseInt(input[0]);
            y1 = Integer.parseInt(input[1]);
            System.out.println("Enter \"x2 y2\" for the first point: ");
            line = in.nextLine();
            input = line.split(" ");
            x2 = Integer.parseInt(input[0]);
            y2 = Integer.parseInt(input[1]);
            System.out.println("Enter \"x3 y3\" for the first point: ");
            line = in.nextLine();
            input = line.split(" ");
            x3 = Integer.parseInt(input[0]);
            y3 = Integer.parseInt(input[1]);
            System.out.println(Area(x1,y1,x2,y2,x3,y3));
        } catch (Exception ex) {
            System.out.println("Invalid input\n");
        }
    }
}
