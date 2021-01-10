package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0; //a nem megadott attribútumokat hol érdemes definiálni kezdőértékkel?
    }
    public Time(int hours){
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(Time time){
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time){
        return this.getInSecond() == time.getInSecond();
    }
    public boolean isEqual(int hours, int minutes, int seconds){
        return this.getInSecond() == new Time(hours,minutes,seconds).getInSecond();
    }
    public boolean isEarlier(Time time){
        return  this.getInSecond() < time.getInSecond();
    }
    public boolean isEarlier(int hours, int minutes, int seconds){
        return this.getInSecond() < new Time(hours,minutes,seconds).getInSecond();
    }

    private int getInSecond() {
        return hours*3600 + minutes*60 +seconds;
    }

}
