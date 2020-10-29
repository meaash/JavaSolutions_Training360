package bookstore;

public class Book {

    private String author;
    private String title;
    private String regNumber;
    private boolean available;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
        this.available = false;
    }

    public void register(String regNumber){
        this.regNumber = regNumber;
        this.available = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String isAvailable() {
        return available? "Elérhető" : "Nem elérhető";
    }
}
