package company;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        Employee e = new Employee("Kiss Józsi", 1980);
        employeeList.add(e);

        Company c =  new Company(employeeList);
        Employee e2 = new Employee("Nagy Béla", 1985);
        Employee e3 = new Employee("Kiss Béla", 1985);
        c.addEmployee(e2);
        c.addEmployee(e3);

        Employee search = c.findEmployeeByName("Nagy Béla");
        System.out.println(search.getName());

        System.out.println(c.listEmployeeNames());
    }
}
