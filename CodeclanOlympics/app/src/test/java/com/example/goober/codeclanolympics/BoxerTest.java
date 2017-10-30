package com.example.goober.codeclanolympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 30/10/2017.
 */

public class BoxerTest {

    Boxer goldBoxer;
    Boxer silverBoxer;
    Boxer bronzeBoxer;

    @Before
    public void before() {
        goldBoxer = new Boxer("Tyson", 25, 5);
        silverBoxer = new Boxer("Bruno", 25, 11);
        bronzeBoxer = new Boxer("Evander", 10, 3);
    }

    @Test
    public void hasName() {

        assertEquals("Tyson", goldBoxer.getName());
    }

    @Test
    public void isCompeting(){
        assertEquals("Here we go!!!", goldBoxer.compete());
    }

    @Test
    public void canCalculate(){
        assertEquals(20, goldBoxer.calculate());
        assertEquals(14, silverBoxer.calculate());
        assertEquals(7, bronzeBoxer.calculate());
    }
}
