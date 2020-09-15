package com.company.interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/6 15:10
 */
public class LinkedListCreator {
    public Node createLinkedList(List<Integer> data){
        if(data.isEmpty()){
            return null;
        }

        Node firstNode =  new Node(data.get(0));
        //截取list列表  若subList（）参数一致 就返回null
        Node headofSublist = createLinkedList(data.subList(1, data.size()));

        firstNode.setNext(headofSublist);
        return firstNode;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();

        Node.printLinkdedList(creator.createLinkedList(new ArrayList<>()));
        Node.printLinkdedList(creator.createLinkedList(Arrays.asList(1)));
        Node.printLinkdedList(creator.createLinkedList(Arrays.asList(1,2,3,4)));

    }
}
