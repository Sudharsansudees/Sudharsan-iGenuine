package Library_management;

public class Book extends Item implements Borrow {
    private String Genre;

    Book(String Genre,String Title, String Author){
        super(Title,Author);
        this.Genre=Genre;
    }

    public String getGenre() {
        return Genre;
    }
    public void purpose(){
        System.out.println("Experiencing the Fist Horror");
    }

    public void Display(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
    }

    public void info(){
        System.out.println("Book should be returned within due date ends");
    }
}
