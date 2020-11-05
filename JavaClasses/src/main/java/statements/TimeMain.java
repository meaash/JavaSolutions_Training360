package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Óra:");
        int h= (tryParse(scanner.nextLine(), 0));
        System.out.println("Perc:");
        int min= (tryParse(scanner.nextLine(), 0));
        System.out.println("Másodperc:");
        int sec= (tryParse(scanner.nextLine(), 0));

        Time firstTime = new Time(h,min,sec);
        System.out.println("Az első időpont: " +firstTime.toString() + " = " + firstTime.getInMinute() + " perc");

        System.out.println("Óra:");
        int h2= (tryParse(scanner.nextLine(), 0));
        System.out.println("Perc:");
        int min2= (tryParse(scanner.nextLine(), 0));
        System.out.println("Másodperc:");
        int sec2= (tryParse(scanner.nextLine(), 0));


        Time secondTime = new Time(h2,min2,sec2);
        System.out.println("A második időpont: " + secondTime.toString() + " = " + secondTime.getInSecond() + " másodperc");
        if (firstTime.earlierThan(secondTime)){
            System.out.println("Az első időpont korábbi a másodiknál: " +firstTime.earlierThan(secondTime) );
        }else{
            System.out.println("A második időpont korábbi az elsőnél: " +firstTime.earlierThan(secondTime));
        }
    }
    static int tryParse(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
