package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> BookList = new ArrayList<>();

    public void loadFromFile(){
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books.csv"))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(";|(\r\n)");
                BookList.add(new Book(split[0], split[1],split[2],Integer.parseInt(split[3])) );
            }
        }
    }

    public List<Book> getBookList() {
        return BookList;
    }
}
