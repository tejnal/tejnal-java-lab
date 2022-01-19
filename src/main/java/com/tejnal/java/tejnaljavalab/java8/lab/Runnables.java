package com.tejnal.java.tejnaljavalab.java8.lab;

import java.util.concurrent.Callable;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-06-16
 */
public class Runnables {

    public void methodAcceptingRunnable(Runnable r){

    }

    public void methodAcceptingCallable(Callable c ) {

    }

    public static void main(String[] args ) {

        new Runnables().methodAcceptingRunnable(() ->
        {
            System.out.println("Complex runnable");
            persist();
            email();

        });

    }

    private static void persist() {
    }

    private static void email() {


        new Runnables().methodAcceptingCallable(() ->
        {
            return "hello callable";
        });

    }

//    interface Traddable<Trade> {
//        boolean check(Trade t );
//    };
//
//    Traddable<Trade> bigTradeLambda = (trade) -> trade.isBigTrade();
}
