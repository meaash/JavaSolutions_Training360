package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private String name;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(String name, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo(){
        return name + ": " + date +" " +startTime +"-" + endTime;
    }

}
