package com.tejnal.java.tejnaljavalab.topics.factorypattern;

import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class FactoryPatternDemo {

    @Test
    public void verifyTheFactoryPattern(){
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());
    }

}
