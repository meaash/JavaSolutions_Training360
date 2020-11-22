package operators;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mynum = 3.2*4+5.17/(6-2.5);//14.277142857142858
        System.out.println("Feladat: 3.2*4+5.17/(6-2.5)");
        System.out.println("Eredmény 2 tizedesjegyre kerekítve:");

        double result= (tryParse(scanner.nextLine(), 0.0));
        System.out.println(checkResult(result)? "Az eredmény helyes!": "Az eredmény helytelen!");


    }
    public static boolean checkResult(double result){
        return  Math.abs(result - 14.27) < 1.0e-15; //delta;

    }

    static double tryParse(String value, double defaultVal) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
