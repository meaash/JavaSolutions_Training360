package operators;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a kör átmérőjét:");
        int diameter= (tryParse(scanner.nextLine(), 0));
        Circle c = new Circle(diameter);
        System.out.println("A kör kerülete: " +c.perimeter());
        System.out.println("A kör területe: "+c.area());
    }
    static int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
