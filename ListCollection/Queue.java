package ListCollection;

import javax.xml.crypto.Data;

public class Queue {
    public int length;
    private int[] queue;
    private int front, rear, maxSize;
    public Queue(int size){
        maxSize=size;
        queue=new int[maxSize];
        front =-1;
        rear=-1;
    }

    public void enQueue(int Data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(front==-1) front=0;
        queue[++rear]=Data;
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value=queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front++;
        }
        return value;

    }

    public int poll(){
        return deQueue();
    }
    public int element(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return front==-1 || front>rear;
    }

    public boolean isFull(){
        return rear==maxSize-1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }


    public int length() {
        return rear+1;
    }
}
