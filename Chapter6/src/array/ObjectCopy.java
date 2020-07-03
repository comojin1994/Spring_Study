package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("book1", "Kim");
        library[1] = new Book("book2", "Lee");
        library[2] = new Book("book3", "Park");
        library[3] = new Book("book4", "Jeung");
        library[4] = new Book("book5", "Wu");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

//        for(Book book : copyLibrary){
//            book.showBookInfo();
//        }

        library[0].setTitle("other");
        library[0].setAuthor("KimKim");

        for (Book book : library){
            book.showBookInfo();
        }

        System.out.println("=====================");

        for (Book book : copyLibrary){
            book.showBookInfo();
        }
    }
}
