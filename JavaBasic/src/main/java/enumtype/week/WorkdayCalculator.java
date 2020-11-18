package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays){
        List<DayType> mydays = new ArrayList<>();
        Day next = nextDay(firstDay);
        for (int i = 0; i < numberOfDays; i++) {
            mydays.add(next.getDayType());
            next = nextDay(next);
        }
        return mydays;

    }
    private Day nextDay(Day day){
        int indexofnextday = day.ordinal() == 6? 0 : day.ordinal()+1;
        Day[] days = Day.values();
        Day nextday = days[indexofnextday];
        return nextday;
    }
}
