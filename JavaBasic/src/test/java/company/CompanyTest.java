package company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {

    @Test
    public void addEmployeeTest(){
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee e = new Employee("Kiss Józsi", 1980);
        employeeList.add(e);
        Company c =  new Company(employeeList);
        Employee e2 = new Employee("Nagy Béla", 1985);
        Employee e3 = new Employee("Kiss Béla", 1985);
        c.addEmployee(e2);
        c.addEmployee(e3);

        assertEquals("Kiss Béla", c.getEmployeeList().get(2).getName());

    }
}
