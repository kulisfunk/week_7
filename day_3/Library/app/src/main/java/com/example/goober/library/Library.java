package com.example.goober.library;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by goober on 02/11/2017.
 */

public class Library<T> {

    private ArrayList<T> inventory;

    public Library() {
        inventory = new ArrayList<>();
    }

    public void addInventory(T t){
        inventory.add(t);
    }

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public T lendBook() {
        return inventory.remove(0);
    }
}
