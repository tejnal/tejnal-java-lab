package com.tejnal.java.tejnaljavalab.topics.abstractclasses;

import com.tejnal.java.tejnaljavalab.topics.abstarctclasses.Server;
import com.tejnal.java.tejnaljavalab.topics.abstarctclasses.Tomcat;
import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-04
 */
public class AbstractClassesExampleTest {

    @Test
    public void verifyAbstractClass() {

        Server server = new Tomcat("Apache Tomcat");
        server.start();

    }
}
