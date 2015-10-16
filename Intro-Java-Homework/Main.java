package com.softuni;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        AssignVariables AV = new AssignVariables();
        PrintCharacters PC = new PrintCharacters();
        PrintACharacterTriangle PCT = new PrintACharacterTriangle();
        SumNumbersFromOneToN SMFOTN = new SumNumbersFromOneToN();
        GhettoNumeralSystem GNS = new GhettoNumeralSystem();
        GetAverage GA = new GetAverage();

        Scanner in = new Scanner(System.in);
        int result=0;

        while (result != 9) {
            System.out.print("\nWhat do you want to do?" +
                    "\n3.Assign Variables" +
                    "\n4.Print Characters" +
                    "\n5.Print A Character Triangle" +
                    "\n6.Sum numbers from 1 to N" +
                    "\n7.Ghetto Numeral System" +
                    "\n8.Get Average" +
                    "\n9.Exit" +
                    "\n");
            String line = in.nextLine();
            try {
                result = Integer.parseInt(line);
            } catch (Exception ex) {
                System.out.println("Invalid input");
                result = 0;
            }
            switch (result) {
                case 3: {
                    AV.Start();
                }
                break;
                case 4: {
                    PC.Start();
                }
                break;
                case 5: {
                    PCT.Start();
                }
                break;
                case 6: {
                    SMFOTN.Start();
                }
                break;
                case 7: {
                    GNS.Start();
                }
                break;
                case 8: {
                    GA.Start();
                } break;
                default:
                    break;
            }
        }
    }
}
