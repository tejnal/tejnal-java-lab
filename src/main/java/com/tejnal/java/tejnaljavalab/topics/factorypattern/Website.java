package com.tejnal.java.tejnaljavalab.topics.factorypattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
       this.createWebsite();
    }

    public abstract void createWebsite();



}
