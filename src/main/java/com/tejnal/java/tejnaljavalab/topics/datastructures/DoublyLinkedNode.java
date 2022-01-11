package com.tejnal.java.tejnaljavalab.topics.datastructures;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-14
 */
public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode nextNode;
    private DoublyLinkedNode previousNode;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedNode previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "Data : " + this.data;
    }
}
