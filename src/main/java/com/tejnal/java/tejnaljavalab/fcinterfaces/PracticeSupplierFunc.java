package com.tejnal.java.tejnaljavalab.fcinterfaces;


import org.springframework.ui.context.Theme;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class PracticeSupplierFunc {

    Supplier<String[]> fruitSupplier = () -> new String[] {"Apple", "Orange", "Mango"};

    public static Supplier<Date>  date = () -> new Date();

    public static Supplier<String> s = () -> {

        String[] bigAlphabets = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] smallAlphabets = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","Z"};
        String[] specialSymbols = new String[]{"!","@","#","$","%","^","&","*","?"};

        String password =bigAlphabets[ThreadLocalRandom.current().nextInt(0, 26)] +
                specialSymbols[ThreadLocalRandom.current().nextInt(0, 9)]+
                ThreadLocalRandom.current().nextInt(0000, 9999) +
                specialSymbols[ThreadLocalRandom.current().nextInt(0, 9)]+
                smallAlphabets[ThreadLocalRandom.current().nextInt(0, 26)]+
                smallAlphabets[ThreadLocalRandom.current().nextInt(0, 26)];
        return password;


    };

    public static void main(String[] args) {
        Date today = date.get();
        System.out.println("Today is :" + today);

        String password1 = s.get();
        var pas2 = s.get();
                var pas3 = s.get();

        System.out.println( "password1 : " + password1 + "\n" + "pas2 : " + pas2 +  "\n" + "pas3 : " + pas3);

    }
}
