package arraylist;

public class BooksMain {
    public static void main(String[] args) {
            Books b = new Books();

            b.addbook("cím123248");
            b.addbook("cím245678");
            b.addbook("12234cím");
            b.addbook("123cím");
            b.addbook("123cím");

        System.out.println(b.findAllByPrefix("cím123248"));
        System.out.println(b.removeByPrefix("cím"));
    }
}
