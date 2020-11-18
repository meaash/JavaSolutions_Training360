package enumtype.week;

import java.util.List;

public class WorkdayCalculatorMain {
    public static void main(String[] args) {
        WorkdayCalculator w = new WorkdayCalculator();
        List<DayType> myDays = w.dayTypes(Day.FRIDAY, 15);
        System.out.println(myDays);
    }
}
