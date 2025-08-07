package Library_management;

public class Library {
    public static void main(String[]args){
    Borrowed_Book obj = new Borrowed_Book("Pragatheesh","Horror","Exorcist","Stephn King","2025/09/18");
    Item[] i=new Item[3];
    i[0]= new Borrowed_Book("Pragatheesh","Horror","Exorcist","Stephn King","2025/09/18");
    i[1]=new Borrowed_Book("Sudheesh","Horror","Possesion","Stephn King","2025/09/18");
    i[2]=new Borrowed_Book("Suhaib","Horror","Until Dawn","Stephn King","2025/09/18");

    for(Item a:i){
        a.Display();
        System.out.println();
    }
        obj.purpose();
        Borrow.Page();
        obj.info();





    }
}
