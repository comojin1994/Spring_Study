package array;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("Book1", "Kim");
        library[1] = new Book("Book2", "Lee");
        library[2] = new Book("Book3", "Park");
        library[3] = new Book("Book4", "Wu");
        library[4] = new Book("Book5", "Jung");

        for (int i = 0 ; i < library.length; i++){
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
