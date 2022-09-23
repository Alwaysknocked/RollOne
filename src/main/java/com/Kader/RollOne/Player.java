package com.Kader.RollOne;

public class Player implements Comparable<Player>{

    public String name="";
    public int score =0;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }

    @Override                                       //Comparable interface method, that compares score attribute.
    public int compareTo(Player o) {
        if(this.getScore()==o.getScore()) return 0;
        else if (this.getScore()>o.getScore()) return -1;
        else return 1;
        }
    }

