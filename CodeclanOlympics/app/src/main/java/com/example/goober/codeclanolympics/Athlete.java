package com.example.goober.codeclanolympics;

/**
 * Created by goober on 30/10/2017.
 */

public  abstract class Athlete {

    protected String name;
    protected int firstPoints;
    protected int secondPoints;

    public Athlete(String name, int firstPoints, int secondPoints) {
        this.name = name;
        this.firstPoints = firstPoints;
        this.secondPoints = secondPoints;
    }

    public String getName() {
        return name;
    }



    public abstract String prepare();

    public abstract String compete();


    public abstract int calculate();
}

