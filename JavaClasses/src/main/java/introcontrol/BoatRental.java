package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int mynum= (tryParse(scanner.nextLine(), 0));



    }
    static int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

}
