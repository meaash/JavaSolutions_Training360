package defaultconstructor.date;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year,month,day)){
            throw new IllegalArgumentException("One or more given parameter cannot be applied! "
                    + year +", " + month+", "+day);
        }
        this.year = year;
        this.month = month;
        this.day = day;


    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        return  (year >= 1900) && (month > 0
                && month <= 12) && (day > 0
                && day <= calculateMonthLength(year, month));
    }

    private boolean isLeapYear(int year){
        return Year.of(year).isLeap();
    }
    private int calculateMonthLength(int year, int month){
        //dátumkezelés hónappal
        return Month.of(month).length(isLeapYear(year));
    }

    @Override
    public String toString() {
        return year +"-"+month+"-"+day;
    }
}
