package com.tejnal.java.tejnaljavalab.topics.immutable;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-02
 */
public class FinalClassExampleTest {

    @Test
    public void validateFinalClassExample() {
        HashMap<String, String> h1 = new HashMap<>();
        h1.put("1", "first");
        h1.put("2", "second");

        var s= "original" ;
        int i=10;

        FinalClassExample ce = new FinalClassExample(i, s,h1);
        //lets see it is copy by field or reference
        System.out.println(s.equals(ce.getName()));
        System.out.println(h1.equals(ce.getTestMap()));
        // print ce values
        System.out.println("ce id:" + ce.getId());
        System.out.println("ce name: " + ce.getName());
        System.out.println("ce testMap: " + ce.getTestMap());

        //change the local variable value
        i=20;
        s="modified";
        h1.put("3", "third");

        //print the values again

        System.out.println("ce id after change in local variable :" + ce.getId());
        System.out.println("ce name after change in local variable : " + ce.getName());
        System.out.println("ce testMap after change in local variable : " + ce.getTestMap());

        var hmTest = ce.getTestMap();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from accessor methods: " + ce.getTestMap());


    }


    @Test
    public  <T> T getName(T name) {


    return null;
    }
}
