package com.tejnal.java.tejnaljavalab.topics.factorypattern.carexample;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class Hybrid extends Car{


    public Hybrid() {
        super(CarType.HYBRID);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
    }
}
