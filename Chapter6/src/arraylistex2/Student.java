package arraylistex2;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name;
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
    }

    public Student(){}

    public void setBookList(String name, int bookID){
        Book book = new Book(name, bookID);
        bookList.add(book);
    }

    public void showStudentInfo(){
        System.out.print(this.name + "'s books : ");
        for(Book book: bookList){
            System.out.print(book.getName() + " ");
        }
        System.out.println();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
