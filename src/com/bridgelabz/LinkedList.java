package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;
    public void add(int data){
        Node node = new Node();
        node.next=null;
        node.data=data;

        if(head==null){
            this.head=node;
        }
        else{
            Node n=head;
        }

    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
      //  list.print();
      //  System.out.println(list.add(10));
    }
}
