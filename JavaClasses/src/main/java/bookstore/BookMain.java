package bookstore;
import java.util.*;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Könyv szerzője:");
        String author = scanner.nextLine();

        System.out.println("Könyv címe:");
        String title = scanner.nextLine();

        System.out.println("Könyv regisztrációs száma:");
        String regNumber = scanner.nextLine();

        Book b = new Book(author, title);
        b.register(regNumber);

        System.out.println("A könyv adatai:\nKönyv címe: " + b.getTitle() +"\nSzerző: " + b.getAuthor()
                +"\nRegszáma: " + b.getRegNumber());
    }
}
