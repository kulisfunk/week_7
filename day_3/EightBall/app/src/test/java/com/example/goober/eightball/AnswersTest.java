package com.example.goober.eightball;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by goober on 02/11/2017.
 */

public class AnswersTest {

    ArrayList<String> testAnswers;

    @Before
    public void before(){
        testAnswers = new ArrayList<>();
        testAnswers.add("Yes!");
        testAnswers.add("No!");
    }

    @Test
    public void getAnswers(){
        Answers answers = new Answers();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void canSetupAnswers(){
        Answers answers = new Answers();
        assertEquals(2, answers.getNumberOfAnswers());
    }

    @Test
    public void canCreateAnswersWithList(){
        Answers answers = new Answers(testAnswers);
        assertEquals(2, answers.getNumberOfAnswers());
    }

    @Test
    public void canAddAnswer(){
        Answers answers = new Answers(testAnswers);
        int originalNumberOfAnswers = answers.getNumberOfAnswers();
        answers.add("I love my brick!");
        assertEquals(originalNumberOfAnswers + 1, answers.getNumberOfAnswers());
    }

    @Test
    public void getAnswerAtSpecificIndex(){
        Answers answers = new Answers(testAnswers);
        String result = answers.getAnswerAtIndex(1);
        assertEquals("No!", result);
    }

    @Test
    public void getRandomAnswer(){
        Answers spy = Mockito.spy(new Answers(testAnswers));
        Mockito.when(spy.getRandomNumber()).thenReturn(1);
        String answer = spy.getAnswer();
        assertEquals("No!", answer);

    }
}
