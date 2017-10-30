package com.example.goober.codeclanolympics;

import static android.os.Looper.prepare;

/**
 * Created by goober on 30/10/2017.
 */

public class Event {

    Athlete athlete1;

    public Event(Athlete athlete) {
        this.athlete1 = athlete;

    }

    public String awardMedal(){
        if (athlete1.calculate() < 10){
            return "Bronze";
        }
        else if (athlete1.calculate() < 15){
            return "Silver";

        }
        return "Gold";
    }

    public String participate() {

        athlete1.prepare();
        athlete1.compete();
        athlete1.calculate();
        return this.awardMedal();
    }
}
