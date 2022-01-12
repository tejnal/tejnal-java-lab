package com.tejnal.java.tejnaljavalab.topics.concurrencylab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.RecursiveAction;

public class ModernSites {

    private List<String> modernCities = new ArrayList<>();
    private List<String> urbanCities = new ArrayList<>();


    public void add(String city) {

        synchronized (this) {
            if (!modernCities.contains(city)) {
                urbanCities.add(city);
            }
        }

    }

    public String next() {

        if (urbanCities.size() == 0) {
            return null;
        }
        synchronized (this) {
            if (urbanCities.size() > 0) {
                String s = urbanCities.get(0);
                urbanCities.remove(0);
                modernCities.add(s);
                return s;

            }

            return null;
        }

    }
}
