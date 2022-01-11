package com.tejnal.java.tejnaljavalab.topics.abstarctclasses;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-04
 */
public class Tomcat extends Server  {
    public Tomcat(String name) {
        super(name);
    }

    @Override
    public boolean start() {
        System.out.println(this.name + "Sever starts successfully");
        return true;
    }
}
