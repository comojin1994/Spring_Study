package arraylistex2;

public class Book {
    private int bookID;
    private String name;

    public Book(String name, int bookID){
        this.name = name;
        this.bookID = bookID;
    }

    public Book(){}

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
