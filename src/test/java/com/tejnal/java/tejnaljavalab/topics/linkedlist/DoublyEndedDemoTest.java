package com.tejnal.java.tejnaljavalab.topics.linkedlist;

import com.tejnal.java.tejnaljavalab.topics.datastructures.DoublyEndedList;
import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-14
 */
public class DoublyEndedDemoTest {

    @Test
    public void verifyDoublyEndedTest() {
        DoublyEndedList dList = new DoublyEndedList();
        dList.insertAtTail(25);
        dList.insertAtTail(56);
        dList.insertAtTail(67);
        dList.insertAtTail(48);
        dList.insertAtTail(89);
        dList.insertAtTail(45);

        System.out.println(dList);


    }
}
