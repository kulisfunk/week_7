package com.example.goober.codeclanolympics;

/**
 * Created by goober on 30/10/2017.
 */

public class Boxer extends Athlete{

        public Boxer(String name, int firstPoints, int secondPoints) {
            super(name, firstPoints, secondPoints);


        }

    @Override
    public String prepare() {
        return "Skip skip skip skip";
    }

    @Override
    public String compete() {
        return "Here we go!!!";
    }

    @Override
    public int calculate() {
        return (super.firstPoints - super.secondPoints);
    }
}
