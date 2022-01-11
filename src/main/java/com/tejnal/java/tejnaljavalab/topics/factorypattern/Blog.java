package com.tejnal.java.tejnaljavalab.topics.factorypattern;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class Blog extends  Website {


    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new Aboutpage());
        pages.add(new CommentPage());
        pages.add(new Contactpage());

    }
}
