package com.company.interview.link;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/12 18:15
 */
public class MyLink {

    //头结点
    static Node head = null;

    //尾插法添加链表数据
    public static void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //临时结点
        Node temp = head;


        while(temp.next != null){
            temp = temp.next;
        }

        //尾插法插入数据
        temp.next = newNode;
    }

    //遍历链表
    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //按照选定顺序插入元素
    public static void insertNode(Node node, int index, int value){
        if(index < 1 || index > linkListLength(head)+1){
            System.out.println("插入的位置不合法");
        }

        Node temp = head;

        int currentPos = 0;

        Node insertNode = new Node(value);

        if(index == 1){
            insertNode.next = head;
            head = insertNode;
            return;
        }
        while(temp.next != null){
            if((index-2) == currentPos){
                insertNode.next = temp.next;

                temp.next = insertNode;

                return;
            }
            currentPos++;
            temp = temp.next;
        }


    }

    //求链表长度
    public static int linkListLength(Node head){
        int sum = 0;
        Node temp = head;
        while(temp != null){
            sum++;
            temp = temp.next;
        }
        return sum;
    }

    //删除结点
    public static void deleteNode(Node head,int index){
        if(index < 1 || index > linkListLength(head)+1){
            System.out.println("删除的位置不合法");
        }

        Node temp = head;

        int currentPos = 0;

        if(index == 1){
            MyLink.head = head.next;
            temp = null;
            return;
        }

        while(temp.next != null){
            if((index-2) == currentPos){
                Node deleteNode = temp.next;
                temp.next = deleteNode.next;
                deleteNode.next = null;
                return;
            }
            currentPos++;
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);

        traverse(head);

        //insertNode(head,1,7);
        deleteNode(head,1);
        traverse(head);

    }
}
