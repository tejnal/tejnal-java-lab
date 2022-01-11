package com.tejnal.java.tejnaljavalab.topics.prototypepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-08
 */
public class Show implements PrototypeCapable {

     private String name = null;

     List<String> listItems = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Show clone() throws CloneNotSupportedException {
        System.out.println("Cloning show object ...");
        return (Show) super.clone();
    }

    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                '}';
    }
}
