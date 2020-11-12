package company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
            this.employeeList = employeeList;
    }
    public void addEmployee(Employee e){
             employeeList.add(e);

        }
    public Employee findEmployeeByName(String name){
        Employee employee = null;
        for (var item:employeeList) {
            if(item.getName().equals(name)) {
               employee = item;
            }
        }
        return employee;
    }
    public List<String> listEmployeeNames(){
        List<String> namelist = new ArrayList<>();
        for (Employee e: employeeList) {
                namelist.add(e.getName());
        }
        return namelist;
    }


}
