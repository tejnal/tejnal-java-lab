package com.tejnal.java.tejnaljavalab.enumeration;


public enum Color {

    RED("red"),
    GREEN("green"),
    YELLOW("yellow");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
