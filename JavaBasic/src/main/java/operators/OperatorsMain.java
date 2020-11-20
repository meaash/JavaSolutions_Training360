package operators;

import java.util.Scanner;

public class OperatorsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int num1= (tryParse(scanner.nextLine(), 0));
        Operator o = new Operator();

        System.out.println(o.isEven(num1)? "A szám páros!": "A szám páratlan!");

        System.out.println(Integer.toBinaryString(16 >> 1));
        System.out.println(Integer.parseInt(Integer.toBinaryString(16 >> 1), 2));
        System.out.println(Integer.toBinaryString(16 << 1));
        System.out.println(Integer.parseInt(Integer.toBinaryString(16 << 1), 2));

        System.out.println(o.multiplyByPowerOfTwo(16,2));

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(Long.valueOf(s, 2).intValue());

        System.out.println(0333); //autoparse to octal

    }
    static int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
