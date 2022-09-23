package com.Kader.RollOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {

    Scanner myScanner = new Scanner(System.in);
    public String gameStart()
    {
        String gameStart="";
        gameStart = myScanner.nextLine().toUpperCase();
        return gameStart;
    }
    public String playerName()
    {
        String pName="";
        boolean correctpName=false;
        while (!correctpName) {
            pName = myScanner.next();
            if (pName.matches("[a-zA-Z]+")) {
                correctpName = true;
            } else System.out.println("Invalid name, make sure to enter only letters!\nPlease try again:");
        }
        return pName;
    }
    public int playerCount()
    {
        int pCount=0;
        boolean correctpCount=false;
        while (!correctpCount) {
            try {
                pCount = myScanner.nextInt();
                correctpCount=true;
            }catch (InputMismatchException e)
            {
                System.out.println("Please make sure to enter only integers!\nPlease try again:");
                myScanner.nextLine();
            }
        }
        return pCount;
    }
    public int roundCount()
    {
        int rCount=0;
        boolean correctrCount=false;
        System.out.print("\nEnter number of rounds: ");
        while (!correctrCount) {
            try {
                rCount = myScanner.nextInt();
                correctrCount=true;
            }catch (InputMismatchException e)
            {
                System.out.println("Please make sure to enter only integers!\nPlease try again:");
                myScanner.nextLine();
            }
        }
        return rCount;
    }
    public int diceCount()
    {
        int dCount=0;
        boolean correctdCount=false;
        System.out.print("\nChoose the number of dice each player gets to throw: ");
        while (!correctdCount) {
            try {
                dCount = myScanner.nextInt();
                correctdCount=true;
            }catch (InputMismatchException e)
            {
                System.out.println("Please make sure to enter only integers!\nPlease try again:");

            }
        }
        return dCount;
    }
    public int dieSides()
    {
        int dieSides=0;
        boolean correctDieSides=false;
        System.out.print("\nChoose the number of sides on each die: ");
        while (!correctDieSides) {
            try {
                dieSides = myScanner.nextInt();
                correctDieSides=true;
            }catch (InputMismatchException e)
            {
                System.out.println("Please make sure to enter only integers!\nPlease try again:");
                myScanner.nextLine();
            }
        }
        return dieSides;
    }

}
