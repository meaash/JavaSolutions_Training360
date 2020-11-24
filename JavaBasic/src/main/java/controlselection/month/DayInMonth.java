package controlselection.month;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;

public class DayInMonth {

    public static void main(String[] args) {
        System.out.println(Year.of(2020).isLeap());
        System.out.println(Year.now().isLeap());
        String mymonth = "December";
        System.out.println(dayInMonth(mymonth.toUpperCase(),2020));
    }

    public static int dayInMonth(String myMonth, int year) {
//return miatt nem kell break

        switch (myMonth) {
            case "JANUÁR":
                return YearMonth.of(year,1).lengthOfMonth();
            case "FEBRUÁR":
                return YearMonth.of(year,2).lengthOfMonth();
            case "MÁRCIUS":
                return YearMonth.of(year,3).lengthOfMonth();
            case "ÁPRILIS":
                return YearMonth.of(year,4).lengthOfMonth();
            case "MÁJUS":
                return YearMonth.of(year,5).lengthOfMonth();
            case "JÚNIUS":
                return YearMonth.of(year,6).lengthOfMonth();
            case "JÚLIUS":
                return YearMonth.of(year,7).lengthOfMonth();
            case "AUGUSZTUS":
                return YearMonth.of(year,8).lengthOfMonth();
            case "SZEPTEMBER":
                return YearMonth.of(year,9).lengthOfMonth();
            case "OKTÓBER":
                return YearMonth.of(year,10).lengthOfMonth();
            case "NOVEMBER":
                return YearMonth.of(year,11).lengthOfMonth();
            case "DECEMBER":
                return YearMonth.of(year,12).lengthOfMonth();
            default:
                throw new IllegalArgumentException("Invalid month: " + myMonth);
        }
    }

    public static boolean isLeapYear(int year) {
        assert year >= 1583; // not valid before this date.
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }


}
