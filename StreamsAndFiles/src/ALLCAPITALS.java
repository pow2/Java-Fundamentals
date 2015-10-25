package com.softuni3;

import java.io.*;

/**
 * Created by pow2 on 22.10.2015 y.
 *
 * Write a program that reads a text file and changes the casing of all letters to upper.
 * The file should be overwritten.
 * Use BufferedReader, FileReader, FileWriter, and PrintWriter.
 */
public class ALLCAPITALS {
    public static void main(String[] args) {
        try{
            // lines2.txt coz SumLines uses lines...
            BufferedReader bR = new BufferedReader( new FileReader("res/lines2.txt"));
            String inputLine;
            String outputLine = "";
            while((inputLine = bR.readLine())!=null) {
                outputLine += inputLine.toUpperCase() + "\r";
            }
            bR.close();
            PrintWriter pW = new PrintWriter( new BufferedWriter(new FileWriter("res/lines2.txt")));
            pW.write(outputLine);
            pW.close();
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
