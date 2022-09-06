package com.Kader.RollOne;

import java.util.Random;

public class Dice {
    Random random = new Random();
    public int diceSides;
    public int diceCount;
    public int faceValue;
    public Dice(int diceSides,int diceCount) {
        this.diceSides = diceSides;
        this.diceCount = diceCount;
    }

    public int throwIt(int diceCount,int diceSides){
        Random myRandom = new Random(diceSides);
        for (int i = 0; i < diceCount; i++) {
            faceValue = myRandom();
        }
        return faceValue;
    }

    private int () {
        return myRandom();
    }
}


