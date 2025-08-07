package ListCollection;

public class LinkedList {
    private Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void addLast(int data){
        add(data);
    }
    public void removeLast(){
        Node current = head;
        if(head.next==null){
            head=null;
        }else{
            Node previous = head;
            while (previous.next.next!=null){
                previous=previous.next;
            }
            previous.next=null;
        }

    }
    public void removeFirst(){
        Node current = head.next;
        head=null;
        head=current;

    }
    public void display(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
}
