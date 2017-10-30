package com.example.goober.codeclanolympics;

/**
 * Created by goober on 30/10/2017.
 */

public class Gymnast extends Athlete{

    public Gymnast(String name, int firstPoints, int secondPoints) {
        super(name, firstPoints, secondPoints);


    }

    @Override
    public String prepare() {
        return "Stretchy stretch stretch";
    }

    @Override
    public String compete() {
        return "One Two Three Boing!!!";
    }

    @Override
    public int calculate() {
        return (super.firstPoints + super.secondPoints);
    }
}