package com.example.goober.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

import static android.media.CamcorderProfile.get;

/**
 * Created by goober on 03/11/2017.
 */

public class FruitMachine {

    String name;
    int funds;
    private ArrayList<Symbols> fruits;
    private int numOfReels;
    int numFruits;
    int spinIndex;
    Boolean isWin = false;
    int winValue = 0;

    public FruitMachine(String name, int numOfReels, int funds) {
        this.name = name;
        this.numOfReels = numOfReels;
        this.funds = funds;
        fruits = new ArrayList<>();
        generateFruits();
    }

    public int getFunds() {
        return funds;
    }

    public void addFunds(int funds) {
        this.funds += funds;
    }

//    public void generateFruits() {
//        for (Symbols symbol : Symbols.values()) {
//            fruits.add(symbol);
//        }
//    }

    public ArrayList<Symbols> generateFruits() {

        int numberOfTimes = 0;
        int numberOfFruits = 0;
            for (Symbols fruit : Symbols.values()) {
                fruits.add(fruit);
                numberOfFruits++;

                for (Symbols symbol : Symbols.values()) {
                     while (numberOfFruits > numberOfTimes) {
                          fruits.add(symbol);
                          numberOfTimes++;

                      if (!(symbol.ordinal() <= numberOfFruits)) ;
                          break;
                }
            }
              numberOfTimes = 0;
        }
        return fruits;
    }

    public String getFruitName(Symbols fruit){
        return fruit.toString();

    }

    public int getFruitValue(Symbols fruit){

        return fruit.getValue();
    }

    public int getFruitSize(){
        return fruits.size();
    }

    public int getRandomNumber(){
        Random rand = new Random();
        int listSize = getFruitSize();
        int random = rand.nextInt(listSize);
        return random;
    }

    public  Symbols getRandomFruit(){
        int index = getRandomNumber();
        Symbols fruit = getFruitAtIndex(index);
        return fruit;
    }

    public Symbols getFruitAtIndex(int index){
        return fruits.get(index);
    }

    public ArrayList<Symbols> spin(){
        ArrayList<Symbols> reels = new ArrayList<Symbols>();
        numFruits = 0;
        do {
            reels.add(getRandomFruit());
            numFruits ++;

        }
        while (numFruits < numOfReels);

     return reels;
    }

    public ArrayList<Symbols> winCheck(ArrayList<Symbols> spins){
        spinIndex = 1;
        while (spinIndex < spins.size()) {

            if (spins.get(0) == spins.get(spinIndex)) {
                isWin = true;
                spinIndex++;
            } else {
                isWin = false;
                break;
            }
        }

        return spins;

    }

    public String result(ArrayList<Symbols> spins){
        if (isWin == true) {
            winValue = spins.get(0).getValue();

            return "Congratulations you got " + spins.size() + " " + spins.get(0).getName() + " with a win of " + spins.get(0).getValue();
        }else{
             if (numOfReels == 3) {
                 winValue = 0;
                 return spins.get(0) + " " + spins.get(1) + " " + spins.get(2) + " No win this time, sorry.";
             }

             }
             winValue = 0;
             return spins.get(0) + " " + spins.get(1) + " " + spins.get(2) + " " + spins.get(3) + " " + spins.get(4) + " No win this time, sorry";
    }


}
