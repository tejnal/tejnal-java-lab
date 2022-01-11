package com.tejnal.java.tejnaljavalab.topics.factorypattern.carexample;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class Luxury extends Car {


    public Luxury() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
    }
}
