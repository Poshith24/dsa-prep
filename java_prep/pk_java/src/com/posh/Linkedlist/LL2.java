package com.posh.Linkedlist;

public class LL2 {



    private Node head;
    private Node tail;
    private int size;

    public LL2(){
        this.size=0;
    }

    public void insertAtfirst(int val){
        Node node = new Node(val);
        if(head==null){
            tail=node;
        }
        node.next=head;
        head=node;
        size++;
    }

    public void insertAtlast(int val){
        Node node = new Node(val);
        if(tail==null){
            tail=node;
            head=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void insert(int val,int ind){
        if(ind==1){
            insertAtfirst(val);
        }
        else if(ind==size){
            insertAtlast(val);
        }
        else{
            Node node = new Node(val);
            Node temp1=head;
            Node temp2=head;
            for(int j=1;j<=ind-1;j++){
                temp1=temp1.next;
                if(j<=ind-2){
                    temp2=temp2.next;
                }
            }
            temp2.next = node;
            node.next=temp1;
        }
        size++;
    }

    public void deleteAtfirst(){
        Node node = head.next;
        head=node;
    }
    public void deleteAtlast(){
        Node node = get(size-1);
        node.next=null;
        if(head==null){
            deleteAtfirst();
        }
    }
    public void delete(int i){
        if(i==1){
            deleteAtfirst();
        }
        else if(i==size){
            deleteAtlast();
        }
        else{
            Node temp1 = get(i-1);
            Node temp2 = get(i+1);
            temp1.next = temp2;
        }
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+"-> ");
            node=node.next;
        }
        System.out.println();
    }

    public Node get(int i){
        Node node = head;
        int j=1;
        while(node!=null & j<i){
            node=node.next;
            j++;
        }
        return node;
    }
    private class Node{
        private int val;
        private Node next;

       public Node(int val){
             this.val = val;
        }
        public Node(int val,Node next){
           this.val=val;
           this.next=next;
        }


    }
}
