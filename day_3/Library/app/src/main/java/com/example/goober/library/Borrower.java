package com.example.goober.library;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by goober on 02/11/2017.
 */

public class Borrower<T> {

    String name;
    ArrayList<T> borrowedBooks;


    public Borrower(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library<T> library){
        T book = library.lendBook();
        borrowedBooks.add(book);
    }

    public T returnBook(){
        return borrowedBooks.remove(0);

    }
}
