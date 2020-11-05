package investments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Befktetett összeg:");
        int fund= (tryParse(scanner.nextLine(), 0));
        System.out.println("Kamatláb:");
        int interestRate= (tryParse(scanner.nextLine(), 0));

        Investment myinv = new Investment(100000, 8);
        System.out.println("Tőke: "+ myinv.getFund()) ;
        System.out.println("Hozam 50 napra: " + myinv.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + myinv.close(80));
        System.out.println( "Kivett összeg 90 nap után: " +myinv.close(90));




    }
    static int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
