package ListCollection;

public class DoublyTask1 {
    public static void main(String[]args){
        DublyLinkedList list = new DublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();
        list.addMid(35,3);
        list.display();
    }
}
