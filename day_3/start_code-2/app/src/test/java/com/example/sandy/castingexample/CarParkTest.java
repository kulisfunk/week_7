package com.example.sandy.castingexample;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class CarParkTest {
    CarPark carPark;
    Car car;
    Motorbike motorbike;

    @Before
    public void before() {
        carPark = new CarPark("NCP");
        car = new Car();
        motorbike = new Motorbike();
    }

    @Test
    public void hasName(){
        assertEquals("NCP", carPark.getName());
    }

    @Test
    public void startsWithNoVehicles() {
        assertEquals(0, carPark.vehicleCount());
    }

    @Test
    public void canAddCar() {
        carPark.add(car);
        assertEquals(1, carPark.vehicleCount());
    }

    @Test
    public void canAddMotorbike() {
        carPark.add(motorbike);
        assertEquals(1, carPark.vehicleCount());
    }

//    @Test
//    public void vehicleCanLeave(){
//        carPark.add(car);
//        Parkable vehicle = carPark.leave();
//        assertEquals("Brrmm! Brrmm!", vehicle.drive());
//    }

    @Test
    public void canGetOriginalCar(){
        carPark.add(car);
        Parkable vehicle = carPark.leave();
        Car original = (Car) vehicle;
        assertEquals("Brrmm! Brrmm!", original.drive());
    }

    @Test
    public void canGetOriginalMotorbike(){
        carPark.add(motorbike);
        Parkable vehicle = carPark.leave();
        Motorbike original = (Motorbike) vehicle;
        assertEquals("Pop a wheelie", original.ride());
    }


}
