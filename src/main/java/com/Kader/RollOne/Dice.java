package com.Kader.RollOne;
import org.junit.Test;

import java.util.Random;

public class Dice {
    Random randomDie = new Random();
    public int dieSides;
    public Dice(int dieSides) {
        this.dieSides = dieSides;
    }
    public int rollTheDice(){
        int rolledDie = randomDie.nextInt(1,dieSides);
        return rolledDie;
    }
}
