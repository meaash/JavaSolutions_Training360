package introdate;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {
         Employee e = new Employee(1986,8,25,"Kovács Edit");
         System.out.println(e.calculateAge());
    }
}
