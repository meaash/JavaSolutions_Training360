package classstructureattributes;
import java.util.*;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét");
        String name = scanner.nextLine();

        int year = 0;
        boolean checknum = false;
        while (!checknum){
            System.out.println("Kérem adja meg a születési évét:");
            String input = scanner.nextLine();
            checknum = tryParseInt(input);
            if (checknum) {
                year =  Integer.parseInt(input);}
        }



    /* if (tryParseInt(input)) {
             year =  Integer.parseInt(input);
        } else {
            System.out.println("Rosszul adta meg az évszámot!");
        }*/

        System.out.println("Kérem adja meg a címét");
        String address = scanner.nextLine();

        Client c = new Client(name, year, address);
        System.out.println(c.getClientData());

    }

    static boolean tryParseInt(String value) { // bool érték visszaadása
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
