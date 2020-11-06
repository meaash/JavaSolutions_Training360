package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Smith";
        String message = prefix + name;
        message += 444;
        System.out.println(message);
        boolean b = message.equals("Hello John Smith");
        System.out.println(b);
        boolean c = message.equals("Hello John Smith444");
        System.out.println(c);
    }
}
