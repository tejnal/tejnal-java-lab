package com.tejnal.java.tejnaljavalab.topics.builderpattern;

import com.tejnal.java.tejnaljavalab.topics.builderPattern.LunchBoxMenu;
import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-07
 */
public class BuilderPatternDemoTests {

    @Test
    public void verifyStringBuilder() {

        StringBuilder builder = new StringBuilder();

        builder.append("This is ");
        builder.append("my Story to success ");
        builder.append(2020);

        System.out.println(builder.toString());

    }

    @Test
    public void verifyLunchBoxMenu() {

        LunchBoxMenu.Builder builder = new LunchBoxMenu.Builder();
        builder.bread("Brown")
                .dressing("Mayo");

        LunchBoxMenu lunchBoxMenu = builder.build();
        System.out.println(lunchBoxMenu.getBread());
        System.out.println(lunchBoxMenu.getMeat());
        System.out.println(lunchBoxMenu.getDressing());
    }
}
