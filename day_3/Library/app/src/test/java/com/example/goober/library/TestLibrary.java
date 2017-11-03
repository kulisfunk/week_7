package com.example.goober.library;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 02/11/2017.
 */

public class TestLibrary {

    Library library;
    Book book1;


    @Before
    public void setup(){
        Book book1 = new Book("War of the Worlds", "H.G.Wells");
        library = new Library<Book>();
    }

    @Test
    public void canAddBook(){
        library.addInventory(book1);
        assertEquals(1, library.getInventory().size());
    }



}
