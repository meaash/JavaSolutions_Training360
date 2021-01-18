package constructoroverloading;

public class SimpleTime {

    private int hours;
    private int minutes;
    //a nem megadott attribútumokat hol érdemes definiálni kezdőértékkel?

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private int getInMin() {
        return hours*60 + minutes;
    }
    public int difference(SimpleTime time){
       return this.getInMin()-time.getInMin();
    }

    @Override
    public String toString() {
        return hours + ":"+minutes;
    }
}
