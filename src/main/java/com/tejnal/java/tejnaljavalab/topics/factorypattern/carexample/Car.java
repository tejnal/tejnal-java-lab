package com.tejnal.java.tejnaljavalab.topics.factorypattern.carexample;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public abstract class Car {

    private CarType model = null;

    public Car(CarType model) {
        this.model = model;
        arrangePart();

    }

    private void arrangePart() {

    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}

