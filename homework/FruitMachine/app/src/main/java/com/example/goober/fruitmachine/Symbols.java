package com.example.goober.fruitmachine;

import static android.R.attr.value;

/**
 * Created by goober on 03/11/2017.
 */

public enum Symbols {
    CHERRY(2),
    LEMON(4),
    PLUM(8),
    STRAWBERRY(10),
    GRAPE(20),
    MELON(25),
    BELL(30),
    BAR(40),
    DOUBLEBAR(50),
    TRIPLEBAR(70),
    SEVEN(100);

    public int value;

    Symbols(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}


