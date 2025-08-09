package ListCollection;

public class DublyLinkedList {

    public int length;
    private Node head;
    private Node tail;
    private class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head=tail=newNode;

        }
        else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void addLast(int data){
        add(data);
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void addMid(int data, int index){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++){
            current=current.next;

        }

        newNode.prev=current;
        newNode.next=current.next;
        current.next=newNode;
        current.next.prev=newNode;







    }
    public void removeMid(int index){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
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
    public void Sum(){
        Node current = head;
        int sum=0;
        while (current!=null){
            sum+=current.data;
            current=current.next;

        }
        System.out.println(sum);
    }
    public void size(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }else {
            Node current = head;

            int count = 0;
            while (current != null) {
                count++;
                current=current.next;
            }
            System.out.println(count);
        }

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
