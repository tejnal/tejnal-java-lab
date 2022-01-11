package com.tejnal.java.tejnaljavalab.topics.datastructures;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-14
 */
public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int data ) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data );
        newNode.setNextNode(head);
        if(this.head != null ){
            this.head.setNextNode(newNode);
        }

        this.head = newNode;
    }

    public int getLength() {
        if (head == null){
            return 0;
        }
        int length = 0;
        DoublyLinkedNode current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();

        }
        return  length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedNode current = this.head;

        while (current !=null) {
            sb.append("Node data");
            sb.append(current);
            sb.append("\n");

            current = current.getNextNode();
        }

        return sb.toString();
    }
}
