package com.company.interview.link;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/12 18:03
 */
public class Node {
    //数据域
    public int data;

    //指针域
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
