package Library_management;

public class Borrowed_Book extends Book{

    private String Borrowed_Name;
    private String Duedate;

    Borrowed_Book(String Borrowed_Name,String Genre,String Title,String Author,String DueDate){
        super(Genre,Title,Author);
        this.Borrowed_Name=Borrowed_Name;
        this.Duedate=DueDate;
    }

    public String getBorrowed_Name() {
        return Borrowed_Name;
    }

    public String getDuedate() {
        return Duedate;
    }

    public void Display(){
        super.Display();
        System.out.println("Genre: "+getGenre());
        System.out.println("Borrower Name: "+getBorrowed_Name());
        System.out.println("DueDate: "+getDuedate());

    }

}
