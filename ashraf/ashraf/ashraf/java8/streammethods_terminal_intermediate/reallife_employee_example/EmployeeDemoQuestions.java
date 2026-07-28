package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemoQuestions {
    public static void main(String[] args) {


        List<Employee> emplst= Arrays.asList(
                new Employee(1,"Ashraf","IT","M",12000),
                new Employee(2,"Manju","HR","F",7000),
                new Employee(3,"Arish","Pharmacy","F",6000),
                new Employee(4,"Kaju","Mechanical","M",10000),
                new Employee(5,"Raju","IT","F",3000)
        );

        System.out.println("Salary greater than 50000");

      List<Employee> salary=  emplst.stream()
                .filter(e->e.getSalary()>5000)
                .collect(Collectors.toList());

        salary.forEach(System.out::println);

        System.out.println("Salary grater than 6000 in onother dways");

        emplst.stream()
                .filter(e->e.getSalary()>6000)
                .forEach(System.out::println);

    }
}
