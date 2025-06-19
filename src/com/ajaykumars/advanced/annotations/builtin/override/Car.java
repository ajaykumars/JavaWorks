package com.ajaykumars.advanced.annotations.builtin.override;

/**
 * Created by ajaykumars on 10/9/2017.
 */
public class Car extends Vehicle {

    @Override
    public void start() {

        System.out.println("Car is started");
    }


    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.start();

    }

}
