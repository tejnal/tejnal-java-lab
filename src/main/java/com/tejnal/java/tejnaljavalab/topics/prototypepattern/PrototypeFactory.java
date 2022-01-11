package com.tejnal.java.tejnaljavalab.topics.prototypepattern;

import org.springframework.ui.ModelMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-08
 */
public class PrototypeFactory {


        public static final String MOVIE = "movie";
        public static final String ALBUMS = "albums";
        public static final String SHOW  = "show";

    private static Map<String , PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(MOVIE, new Movie());
        prototypes.put(ALBUMS, new Albums());
        prototypes.put(SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s ) throws CloneNotSupportedException {
        return prototypes.get(s).clone();
    }
}
