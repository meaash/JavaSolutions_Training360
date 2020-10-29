package bookstore;
import java.util.*;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Könyv szerzője:");
        String author = scanner.nextLine();

        System.out.println("Könyv címe:");
        String title = scanner.nextLine();

        Book b = new Book(author, title);
        System.out.println("Regisztrálva van a könyv?");
        System.out.println(b.isAvailable());
        System.out.println("A könyv regisztrálása...");
        System.out.println("Könyv regisztrációs száma:");
        String regNumber = scanner.nextLine();
        b.register(regNumber);
        System.out.println(b.isAvailable());
        System.out.println("A könyv adatai:\nKönyv címe: " + b.getTitle() +"\nSzerző: " + b.getAuthor()
                +"\nRegszáma: " + b.getRegNumber());
    }
}
