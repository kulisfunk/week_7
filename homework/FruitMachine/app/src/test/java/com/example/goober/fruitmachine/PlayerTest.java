package com.example.goober.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 03/11/2017.
 */

public class PlayerTest {

    Player player1;

    @Before
    public void setup(){
        player1 = new Player("Bob", 100);
    }


    @Test
    public void hasFunds(){
        assertEquals(100, player1.getFunds());
    }

    @Test
    public void canSetPlayerFunds(){
        player1.addFunds(100);
        assertEquals(200, player1.getFunds());
    }
}
