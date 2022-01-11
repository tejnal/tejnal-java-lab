package com.tejnal.java.tejnaljavalab.topics.prototypepattern;

import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class PrototypePatternDemoExamples {

    @Test
    public void verifyPrototype() throws CloneNotSupportedException {

        var moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.MOVIE).toString();
        System.out.println(moviePrototype);

        var albumPrototype = PrototypeFactory.getInstance(PrototypeFactory.ALBUMS).toString();
        System.out.println(albumPrototype);



    }
}
