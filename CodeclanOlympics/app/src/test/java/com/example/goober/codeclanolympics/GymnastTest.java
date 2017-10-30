package com.example.goober.codeclanolympics;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by goober on 30/10/2017.
 */

public class GymnastTest {

    Gymnast goldGymnast;
    Gymnast silverGymnast;
    Gymnast bronzeGymnast;

    @Before
    public void before() {
        goldGymnast = new Gymnast("Nadia", 6, 10);
        silverGymnast = new Gymnast("Svetlana", 4, 7);
        bronzeGymnast = new Gymnast("Carey", 1, 6);
    }

    @Test
    public void hasName() {

        assertEquals("Nadia", goldGymnast.getName());
        assertEquals("Svetlana", silverGymnast.getName());
        assertEquals("Carey", bronzeGymnast.getName());
    }

    @Test
    public void isCompeting(){
        assertEquals("One Two Three Boing!!!", goldGymnast.compete());
    }

    @Test
    public void canCalculate(){
        assertEquals(16, goldGymnast.calculate());
        assertEquals(11, silverGymnast.calculate());
        assertEquals(7, bronzeGymnast.calculate());
    }
}
