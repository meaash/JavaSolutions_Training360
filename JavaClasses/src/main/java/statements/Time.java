package statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInHour() {
        return hour;
    }

    public int getInMinute() {
        return hour*60 + minute;
    }

    public int getInSecond() {
        return hour*3600 + minute*60 +second;
    }
    boolean earlierThan(Time time){
        return time.getInSecond() > this.getInSecond();
    }
    public String toString(){
        return hour + ":"+minute+ ":"+ second;
    }
}
