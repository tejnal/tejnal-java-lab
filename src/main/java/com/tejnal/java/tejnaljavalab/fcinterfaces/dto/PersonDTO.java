package com.tejnal.java.tejnaljavalab.fcinterfaces.dto;

import java.io.Serializable;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-07-19
 */
public class PersonDTO  {

    private String name;
    private int age;

    public PersonDTO(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
