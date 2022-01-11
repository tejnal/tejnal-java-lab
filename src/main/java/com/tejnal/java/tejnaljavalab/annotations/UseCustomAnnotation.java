package com.tejnal.java.tejnaljavalab.annotations;

import org.springframework.beans.factory.annotation.Value;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2022-01-10
 */
public class UseCustomAnnotation {

    @MyCustomAnnotation(value = 15)
    public void sayHello() {
        System.out.println("Here I am using custome annotation ");
    }
}
