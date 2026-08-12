package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.mixed_alloperations_realworld;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.Arrays;
import java.util.List;

public class MixedAllOpr {
    public static void main(String[] args) {


        List<Employee> emplst= Arrays.asList(
                new Employee(1,"Ashraf","IT","M",12000),
                new Employee(2,"Manju","HR","F",7000),
                new Employee(3,"Arish","Pharmacy","M",6000),
                new Employee(4,"Kaju","Mechanical","M",10000),
                new Employee(5,"Raju","IT","F",3000),
                new Employee(6, "Priya", "Finance", "F", 15000),
                new Employee(7, "Rahul", "IT", "M", 18000),
                new Employee(8, "Sneha", "HR", "F", 9000)
        );

        System.out.println("Employees salary greater than 5000");

        emplst.stream()
                .filter(e->e.getSalary()>5000)
                .forEach(System.out::println);


        System.out.println("Get only employees Names");

        emplst.stream()
                .map(Employee::getName)
                .forEach(System.out::println);


        System.out.println("Get only It employees names");


        emplst.stream()
                .filter(e->e.getDepartment().equalsIgnoreCase("IT"))
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
