package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int num1= (tryParse(scanner.nextLine(), 0));
        System.out.println("Kérek még egy egész számot:");
        int num2 = (tryParse(scanner.nextLine(), 0));
        int sum = num1 +num2;

        System.out.println(num1 + "+" + num2 + "=" + sum);
    }
    static int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

   /* static boolean tryParseInt(String value) { // bool érték visszaadása
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }*/
}
