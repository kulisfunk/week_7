package com.example.goober.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 03/11/2017.
 */

public class FruitMachineTest {

    FruitMachine game1;
    FruitMachine game2;
    FruitMachine game3;
    FruitMachine game4;
    ArrayList<Symbols> testFruits;

    @Before
    public void setup(){

        game1 = new FruitMachine("Golden Balls", 3, 1000);
        game2 = new FruitMachine("Fiery Sevens", 5, 1000);
        testFruits = new ArrayList<>();
        testFruits.add(Symbols.CHERRY);
        testFruits.add(Symbols.SEVEN);

    }

//    @Test
//    public void hasFunds(){
//        assertEquals(1000, game1.getFunds());
//    }
//
//    @Test
//    public void canAddToFunds(){
//        game1.addFunds(1000);
//        assertEquals(2000, game1.getFunds());
//    }

    @Test
    public void canGenerateFruits(){
        assertEquals(77, game1.getFruitSize());
    }

//    @Test
//    public void getFruitAtIndex(){
//        assertEquals("GRAPES", game1.getFruitName(game1.getFruitAtIndex(4)));
//    }

//    @Test
//    public void getRandomFruit(){
//        assertEquals("CHERRY", game1.getFruitName(game1.getRandomFruit()));
//    }

//    @Test
//    public void canGetFruitValue(){
//
//        assertEquals(20, game1.getFruitValue(game1.getFruitAtIndex(4)));
//    }
//
//    @Test
//    public void canGetSpin(){
//        assertEquals(3, game1.spin().size());
//        assertEquals(5, game2.spin().size());
//
//    }
//
    @Test
    public void canGiveWinnings(){
        assertEquals(20, game1.result(game1.winCheck(game1.spin())));
        assertEquals(20, game2.result(game2.winCheck(game2.spin())));
    }


}
