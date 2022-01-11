package com.tejnal.java.tejnaljavalab.topics.abstarctclasses;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-04
 */
public abstract class Server {

    protected final String name;

    public Server(String name) {
        this.name = name;
    }

    public abstract boolean start();
}
