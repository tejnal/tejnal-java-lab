package com.tejnal.java.tejnaljavalab.topics.prototypepattern;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-08
 */
public interface PrototypeCapable extends Cloneable {

     PrototypeCapable clone() throws CloneNotSupportedException;

}
