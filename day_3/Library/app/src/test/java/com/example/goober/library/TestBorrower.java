package com.example.goober.library;

import org.junit.Test;

/**
 * Created by goober on 02/11/2017.
 */

public class TestBorrower {

    Borrower borrower;
    Library library;

    @Test
    public void canBorrowBook(){
        library = new Library<Book>();
        borrower = new Borrower<Book>();

    }
}
