package constructoroverloading;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timetable = new ArrayList<>();
    private int firstHour;
    private int lastHour;
    private int everyMinute;


    public BusTimeTable(List<SimpleTime> timeTable){
        this.timetable = timeTable;
       // this.timetable.addAll(timeTable);
    }
    public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        for (int i = firstHour; i <=lastHour; i++) {
            timetable.add(new SimpleTime(i, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timetable;
    }

    public SimpleTime nextBus(SimpleTime actual){

      //findfirst az első lehetségest, ami nagyobb mint 0, mivel sorraendben vannak a listában
        //foreach ciklusból nem szabad return-t adni, nagyobb adatmennyiségnél probléma!!!

        return timetable
                .stream()
                .filter(s -> s.difference(actual) >= 0).findFirst()
                .orElseThrow( () ->new IllegalStateException("No more buses today!"));
    }

}
