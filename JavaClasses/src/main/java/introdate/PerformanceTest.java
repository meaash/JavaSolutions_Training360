package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate mydate = LocalDate.of(2020,11,7);
        LocalTime mystart = LocalTime.of(8, 00);
        LocalTime myend = LocalTime.of(22, 00);

        Performance p = new Performance("Zenekar", mydate,mystart,myend);
        System.out.println(p.getInfo());
    }
}
