package com.tejnal.java.tejnaljavalab.topics.prototypepattern;

import java.util.List;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-08
 */
public class Movie implements PrototypeCapable {

    private String name = null;

    static double sunOfNumbersList(List<? extends Number> numbers){

        double sum = 0.0;
        for(Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;

    }

    public void callList() {
        sunOfNumbersList(List.of(1,8,3,6));
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie Object.. ");
        return (Movie) super.clone();
    }
}
