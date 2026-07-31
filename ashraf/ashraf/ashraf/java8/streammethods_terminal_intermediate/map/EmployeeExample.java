package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.map;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Ashraf", "IT", "M", 12000),
                new Employee(2, "Manju", "HR", "F", 7000),
                new Employee(3, "Arish", "Pharmacy", "M", 6000),
                new Employee(4, "Kaju", "Mechanical", "M", 10000),
                new Employee(5, "Raju", "IT", "F", 3000),
                new Employee(6, "Priya", "Finance", "F", 15000),
                new Employee(7, "Rahul", "IT", "M", 18000)
        );

        System.out.println("Get Employee Names");

        employeeList.stream()
                .map(e -> e.getName())
                .forEach(System.out::println);


        System.out.println("Get Emp Salaries");

        employeeList.stream()
//                .map(e->e.getSalary())
                .map(Employee::getSalary)
                .forEach(System.out::println);


        System.out.println("Increase salary by 10%");

        employeeList.stream()
                .map(e -> e.getSalary() * 1.10)
                .forEach(System.out::println);


        System.out.println("Get employee department");

        employeeList.stream()
                .map(Employee::getDepartment)
                .forEach(System.out::println);
    }
}
