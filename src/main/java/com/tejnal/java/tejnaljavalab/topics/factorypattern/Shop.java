package com.tejnal.java.tejnaljavalab.topics.factorypattern;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class Shop extends Website {


    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
