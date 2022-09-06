package com.Kader.RollOne;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------Welcome to ROLL A SXS dice game-----------------------------\n" +
                "-----------------------------PRESS R TO START A GAME-----------------------------\n" +
                "-----------------------------Any other button to exit-----------------------------");
        String start = UserInputs.myScanner.nextLine().toUpperCase();

        if (start.equals("R")) {
            System.out.println("Enter how many player will be playing: ");
            int playersCount = UserInputs.myScanner.nextInt();
            Player[] players = new Player[playersCount];
            System.out.println("Enter Players name: ");
            for (int i = 0; i < playersCount; i++) {
                System.out.print("player "+1+i+" name: ");
                String names = UserInputs.myScanner.next();
                players[i] = new Player(names, 0);
            }
            System.out.print("Enter number of rounds: ");
            int rounds = UserInputs.myScanner.nextInt();
            System.out.print("Choose the number of dice each player gets to throw: ");
            int diceCount = UserInputs.myScanner.nextInt();
            System.out.print("Choose the number of sides of each die: ");
            int diceS = UserInputs.myScanner.nextInt();
            Dice myDie = new Dice(diceS,diceCount);
        }
    }
}

