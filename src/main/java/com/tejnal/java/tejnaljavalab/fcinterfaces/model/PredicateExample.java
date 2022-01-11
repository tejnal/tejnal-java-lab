package com.tejnal.java.tejnaljavalab.fcinterfaces.model;


import java.util.function.Predicate;

public class PredicateExample {

    public  static void main(String[] args ) {

        Predicate<Person>  predicate = person -> person.getAge() > 28;
        boolean result = predicate.test(new Person("sanju", 26));
        System.out.println("result : " + result);

        boolean testme = predicate.negate().test(new Person("vinjon", 34));
        System.out.println("result : " + testme);

    }
}
