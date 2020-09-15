package com.company.interview.recursion;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/6 15:06
 */
public class Node {
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printLinkdedList(Node head){
        while(head != null){
            System.out.print(head.getValue()+" ");
            head = head.getNext();
        }
        System.out.println();
    }
}
