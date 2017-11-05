package com.example.goober.fruitmachine;

import static android.R.attr.value;

/**
 * Created by goober on 03/11/2017.
 */

public enum Symbols {
    CHERRY(2, "CHERRIES"),
    LEMON(4, "LEMONS"),
    PLUM(8, "PLUMS"),
    STRAWBERRY(10, "STRAWBERRIES"),
    GRAPE(20, "GRAPES"),
    MELON(25, "MELONS"),
    BELL(30, "BELLS"),
    BAR(40, "BARS"),
    DOUBLEBAR(50, "DOUBLEBARS"),
    TRIPLEBAR(70, "TRIPLeBARS"),
    SEVEN(100, "SEVENS");

    public int value;
    public String name;

    Symbols(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}


