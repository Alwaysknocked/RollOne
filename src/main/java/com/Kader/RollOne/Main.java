package com.Kader.RollOne;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        InputClass userInput = new InputClass();
        int rolledDie ;
        System.out.println("""
                -----------------------------Welcome to ROLL ONE dice game-----------------------------
                ---------------------------------PRESS R TO START A GAME-------------------------------
                --------------------------------Any other button to exit-------------------------------""");
        String start = userInput.gameStart();
        if (start.equals("R")) {
            System.out.println("Enter how many players will be playing: ");
            int playerCount =userInput.playerCount();
            Player[] players = new Player[playerCount];
            System.out.println("\nEnter Players name: ");
            for (int i = 0; i < playerCount; i++) {
                System.out.print("\nplayer " + (i + 1) + " name: ");
                String playerName = userInput.playerName();
                players[i] = new Player(playerName, 0);
            }
            int roundCount = userInput.roundCount();
            int diceCount = userInput.diceCount();
            int dieSides = userInput.dieSides();
            Dice myDie = new Dice(dieSides+1);
            for (int i = 0; i < roundCount; i++) {              //Each round
                System.out.println("\n------------ Round "+ (i + 1) +" ------------ \n");
                for (int j = 0; j < playerCount; j++) {        //loops for each player.
                    System.out.println("\n" + players[j].name + " throws:\n");
                    for (int k = 0; k < diceCount; k++) {
                        rolledDie = myDie.rollTheDice();
                        players[j].score += rolledDie;
                        System.out.println("Die " + (k + 1) + ": " + rolledDie);
                    }
                }
            }
            Arrays.sort(players);                               //Sorting player list with the highest score at top.
            System.out.println("\nTotal score ranked by highest :\n");
            for (int i = 0; i < playerCount; i++) {
                System.out.println((i + 1) + ". " + players[i].name + " " + players[i].score+"\n");
            }
            if (players[0].score == players[1].score)         //In case there is a draw between top 2 players.
            {
                System.out.println("""

                        ***********It seems we have a draw!***********
                        Each player gets to throw one die, highest throw WINS THE GAME!
                        """);
                System.out.println(players[0].name + " throws: " + (players[0].score = myDie.rollTheDice())+"\n");
                System.out.println(players[1].name + " throws: " + (players[1].score = myDie.rollTheDice())+"\n");
                if (players[0].score > players[1].score) {
                    System.out.println(players[0].name + " Won!!");
                } else System.out.println(players[1].name + " Won!!");
            } else
                System.out.println("The winner is: " + players[0].name + " With score: " + players[0].score);
        } else
            System.out.println("GOODBYE!");
    }
}