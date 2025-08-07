package ListCollection;

public class StackPro {
    private int[] stack;
    private int top;
    private int maxSize;

    StackPro(int Size){
        stack = new int [Size];
        top=-1;
        maxSize=Size;

    }

    public void Push(int Data){
        if(isFull()){
            System.out.println("Stack OverFlow");
            return;
        }

        stack[++top]=Data;
    }

    public int Pop(){
        if (isEmpty()){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return stack[top--];
    }
    public int Peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return stack[top];
    }


    public boolean isFull(){
        return top==maxSize-1;

    }
    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }


    public int length() {
        return top+1;
    }



}
