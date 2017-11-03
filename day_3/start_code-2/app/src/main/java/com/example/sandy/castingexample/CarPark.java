package com.example.sandy.castingexample;

import java.util.*;

public class CarPark {
    private String name;
    private ArrayList<Parkable> vehicles;

    public CarPark(String name){
        this.vehicles = new ArrayList<Parkable>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int vehicleCount(){
        return vehicles.size();
    }

    public void add(Parkable vehicle){
        vehicles.add(vehicle);
    }

    public Parkable leave(){
        if(vehicleCount() > 0){
            return vehicles.remove(0);
        }
        return null;

    }
}
