package com.tejnal.java.tejnaljavalab.java8.lab;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-06-16
 */
public class CreatingLambdas {

    // lambda expression is kind of anonymous class

    // an interface with single abstract method
    interface Greeting{
         String sayHello(String g);
    }

    // interface can pass a method parameter
    public void testGreeting(String a, Greeting g) {
        var result = g.sayHello(a);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        //when you have interface with single abstract method you can pass that as lambda expression
        // where ever the  functional interfaces is available lambda expression can be passed
        new CreatingLambdas().testGreeting("Harry", (s) -> "Hello, " + s );
        new CreatingLambdas().testGreeting("Mike", (s) -> !s.isEmpty()? "Howdy, " + s : "Did you miss something?");
    }


}
