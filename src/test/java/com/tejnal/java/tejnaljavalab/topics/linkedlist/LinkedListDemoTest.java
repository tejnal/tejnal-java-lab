package com.tejnal.java.tejnaljavalab.topics.linkedlist;

import com.tejnal.java.tejnaljavalab.topics.datastructures.LinkedListImpl;
import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-13
 */
public class LinkedListDemoTest {

    @Test
    public void verifyAddNewElement() {
        LinkedListImpl list = new LinkedListImpl();
        list.insertAtHead(25);
        list.insertAtHead(34);
        list.insertAtHead(46);
        list.insertAtHead(59);
        list.insertAtHead(62);
        list.deleteFromHead();
        System.out.println(list);
        System.out.println(list.getLength());
        System.out.println("Search for element : " + list.searchForAnElement(46));
    }
}
