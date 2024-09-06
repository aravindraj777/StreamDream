package instaInterview.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList
                        (new Employee("Aravind",45,30,"Bangalore"),
                        new Employee("Sreekanth",59,33,"Trivandrum"),
                        new Employee("Aswin",202,90,"Kozhikode"));

        Optional<Employee> maxSalaryEmployee = employeeList
                .stream()
                .max(Comparator.comparingDouble(Employee::getEmployeeSalary));

        System.out.println(maxSalaryEmployee.get().getEmployeeName());
    }
}
