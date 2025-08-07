package Library_management;

abstract public class Item {
    private String Title;
    private String Author;

    Item(String Title,String Author){
        this.Title=Title;
        this.Author=Author;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    abstract void purpose();


    public void Display() {
    }
}
