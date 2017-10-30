package com.example.goober.codeclanolympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 30/10/2017.
 */

public class EventTest {

    Gymnast goldGymnast;
    Gymnast silverGymnast;
    Gymnast bronzeGymnast;
    Boxer goldBoxer;
    Boxer silverBoxer;
    Boxer bronzeBoxer;
    Event event1;
    Event event2;
    Event event3;
    Event event4;
    Event event5;
    Event event6;

    @Before
    public void before(){

        goldGymnast = new Gymnast("Nadia", 6, 10);
        silverGymnast = new Gymnast("Svetlana", 4, 7);
        bronzeGymnast = new Gymnast("Carey", 1, 6);
        goldBoxer = new Boxer("Tyson", 25, 5);
        silverBoxer = new Boxer("Bruno", 25, 11);
        bronzeBoxer = new Boxer("Evander", 10, 3);
        event1 = new Event(goldBoxer);
        event2 = new Event(silverBoxer);
        event3 = new Event(bronzeBoxer);
        event4 = new Event(goldGymnast);
        event5 = new Event(silverGymnast);
        event6 = new Event(bronzeGymnast);

    }

    @Test
    public void hasMedalAwarded(){
        assertEquals("Gold", event1.participate());
        assertEquals("Silver", event2.participate());
        assertEquals("Bronze", event3.participate());
        assertEquals("Gold", event4.participate());
        assertEquals("Silver", event5.participate());
        assertEquals("Bronze", event6.participate());
    }

}
