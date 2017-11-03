package com.example.goober.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by goober on 02/11/2017.
 */

public class Answers implements Answerable{

    private ArrayList<String> answers;

    public Answers(){
        answers = new ArrayList<>();
        setUpAnswers();
    }

    public Answers(ArrayList<String> newAnswers){
        this.answers = newAnswers;
    }



    public ArrayList<String> getAnswers() {
        return new ArrayList<>(answers);
    }

    public int getNumberOfAnswers(){
        return this.answers.size();
    }

    public void setUpAnswers(){
        String[] answersToAdd = {"yes!", "No!"};
        for (String answer : answersToAdd){
            this.answers.add(answer);
        }

    }

    public void add(String newAnswer){
        answers.add(newAnswer);

    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    public int getRandomNumber(){
        Random rand = new Random();
        int listSize = getNumberOfAnswers();
        int random = rand.nextInt(listSize);
        return random;
    }

    public  String getAnswer(){
        int index = getRandomNumber();
        String answer = getAnswerAtIndex(index);
        return answer;
    }

}
