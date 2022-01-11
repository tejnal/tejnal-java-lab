package com.tejnal.java.tejnaljavalab.topics.prototypepattern;

import java.util.Calendar;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-08
 */
public class Albums implements PrototypeCapable {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Albums clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album object ... ");
        return (Albums) super.clone();
    }

    @Override
    public String toString() {
        return "Albums{" +
                "name='" + name + '\'' +
                '}';
    }
}
