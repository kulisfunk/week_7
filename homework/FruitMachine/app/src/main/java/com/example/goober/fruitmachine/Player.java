package com.example.goober.fruitmachine;

/**
 * Created by goober on 03/11/2017.
 */

public class Player {

    String name;
    int funds;

    public Player(String name, int funds) {
        this.name = name;
        this.funds = funds;
    }

    public void addFunds(int funds) {
        this.funds += funds;
    }

    public int getFunds() {
        return funds;
    }
    

}
