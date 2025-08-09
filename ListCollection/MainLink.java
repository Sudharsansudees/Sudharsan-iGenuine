package ListCollection;

public class MainLink {
    public static void main(String[]args){
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display();
        list.addMid(7,2);
        list.display();
        list.removeMid(2);
        list.display();
    }

}
