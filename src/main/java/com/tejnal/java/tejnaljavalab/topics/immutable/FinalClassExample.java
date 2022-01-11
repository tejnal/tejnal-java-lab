package com.tejnal.java.tejnaljavalab.topics.immutable;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-02
 */
public final class FinalClassExample {

    private final int id;

    private final String name;

    private final HashMap<String, String> testMap;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        //return testMap;

        return (HashMap<String, String>) testMap.clone();
    }

    public FinalClassExample(int i, String n, HashMap<String,String> hm){
        System.out.println("Performing Shallow Copy for Object initialization");
        this.id=i;
        this.name=n;
        this.testMap=hm;
    }

//    public FinalClassExample(int id, String name, HashMap<String, String> testMap) {
//        System.out.println("Perform the deep copy of object initialization");
//        this.id = id;
//        this.name = name;
//
//        var tempMap = new HashMap<>();
//        String key;
//
//        for (String s : testMap.keySet()) {
//            key = s;
//            tempMap.put(key, testMap.get(key));
//        }
//        this.testMap = testMap;
//    }
}
