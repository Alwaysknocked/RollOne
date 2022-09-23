package com.Kader.RollOne;

import org.junit.Test;
import org.junit.Assert;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClassTest {
    Scanner myTestScanner = new Scanner(System.in);

    public int diceCount() {
        int dCount = 0;
        boolean incorrectdCount = true;
        System.out.print("\nChoose the number of dice each player gets to throw: ");
        while (incorrectdCount) {
            try {
                dCount = 4; //Simulating an input from user
                incorrectdCount = false;
            } catch (InputMismatchException e) {
                System.out.println("Please make sure to enter only integers!");
                myTestScanner.nextLine();
            }
        }
        return dCount;
    }

    @Test                                               //First test
    public void diceCountTest() {

        Assert.assertEquals(4, diceCount());
    }
    public String playerName()
    {
        String pName="";
        boolean incorrectpName=true;
        while (incorrectpName) {
            pName = "Guego"; //Simulating an input from user, a random name for test purposes
            if (pName.matches("[a-zA-Z]+")) {
                incorrectpName = false;
            } else System.out.println("Invalid name, make sure to enter only letters!\nPlease try again:");
        }
        return pName;
    }

    @Test                                               //Second test
    public void playerNameTest() {
        Assert.assertEquals("Guego",playerName());
    }

    public int playerCount()
    {
        int pCount=0;
        boolean correctpCount=false;
        while (!correctpCount) {
            try {
                pCount = 6;
                correctpCount=true;
            }catch (InputMismatchException e)
            {
                System.out.println("Please make sure to enter only integers!\nPlease try again:");
                myTestScanner.nextLine();
            }
        }
        return pCount;
    }
    @Test                                               //Third test
    public void playerCountTest() {
        Assert.assertEquals(6,playerCount());
    }

}