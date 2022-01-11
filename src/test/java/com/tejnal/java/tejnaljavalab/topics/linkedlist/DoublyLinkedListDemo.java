package com.tejnal.java.tejnaljavalab.topics.linkedlist;

import com.tejnal.java.tejnaljavalab.topics.datastructures.DoublyEndedList;
import com.tejnal.java.tejnaljavalab.topics.datastructures.DoublyLinkedList;
import org.junit.jupiter.api.Test;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-14
 */
public class DoublyLinkedListDemo {


    @Test
    public void testDoublyLinkedList()
    {
        DoublyLinkedList integers = new DoublyLinkedList();
        integers.insertAtHead(45);
        integers.insertAtHead(67);
        integers.insertAtHead(90);
        integers.insertAtHead(78);

        System.out.println(integers);
    }


}
