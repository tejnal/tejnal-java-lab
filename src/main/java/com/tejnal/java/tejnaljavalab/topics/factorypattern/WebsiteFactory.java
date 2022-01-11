package com.tejnal.java.tejnaljavalab.topics.factorypattern;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-09
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType){
            case BLOG:{
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }

            default:{
               return  null;
            }
        }

    }
}
