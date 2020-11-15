package objects;

import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1);
        System.out.println(new Book());
        Book emptyBook = new Book();
        emptyBook = null;
        System.out.println(emptyBook);
        Book book = new Book();
        book = b1;
        System.out.println(book);
        Book anotherBook = new Book();

        //megvizsgálja hogy Book példányú e
        System.out.println(anotherBook instanceof Book);

        Book[] bookArray = new Book[3];
        bookArray[0] = new Book();
        bookArray[1] = new Book();
        bookArray[2] = new Book();

        System.out.println(Arrays.toString(bookArray));

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());
    }
}
