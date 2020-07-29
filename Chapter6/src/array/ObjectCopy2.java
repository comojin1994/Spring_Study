package array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("book1", "Kim");
        library[1] = new Book("book2", "Lee");
        library[2] = new Book("book3", "Park");
        library[3] = new Book("book4", "Jueng");
        library[4] = new Book("book5", "Wu");

//        copyLibrary[0] = new Book();
//        copyLibrary[1] = new Book();
//        copyLibrary[2] = new Book();
//        copyLibrary[3] = new Book();
//        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i] = new Book(library[i].getTitle(), library[i].getAuthor());
//            copyLibrary[i].setAuthor(library[i].getAuthor());
//            copyLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setTitle("other");
        library[0].setAuthor("KimKim");

        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("====================");

        for (Book book : copyLibrary) {
            book.showBookInfo();
        }
    }
}
