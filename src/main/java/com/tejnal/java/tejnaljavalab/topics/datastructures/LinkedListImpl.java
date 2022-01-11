package com.tejnal.java.tejnaljavalab.topics.datastructures;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-13
 */
public class LinkedListImpl {

    private Node head;


    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int getLength() {
        int length = 0;
        Node current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();

        }

        return  length;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();

    }

    public Node searchForAnElement(int data ) {

        Node current = this.head;

        while (current !=null) {
            if(current.getData() == data ) {
                return current;
            }
            current = current.getNextNode();
        }

        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current !=null) {
            result += current.toString() + " , ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
