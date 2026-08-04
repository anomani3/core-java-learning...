package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.limit;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LimitDemo {
    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(1,2,4,5,6,5,77,4,44,30);

        System.out.println("Find first threee elements");

        lst.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("first 5 strings");

        List<String> names = Arrays.asList(
                "Ashraf",
                "Arish",
                "Rahul",
                "Manju",
                "Juber",
                "Zaki"
        );

        names.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Top 3 Highest Numbers");

        lst.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);


        System.out.println("Loest 3 Numbers");

        lst.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);


        System.out.println("First two Employees");

        List<Employee> emplst= Arrays.asList(
                new Employee(1,"Ashraf","IT","M",12000),
                new Employee(2,"Manju","HR","F",7000),
                new Employee(3,"Arish","Pharmacy","M",6000),
                new Employee(4,"Kaju","Mechanical","M",10000),
                new Employee(5,"Raju","IT","F",3000),
                new Employee(6, "Priya", "Finance", "F", 15000),
                new Employee(7, "Rahul", "IT", "M", 18000),
                new Employee(8, "Sneha", "HR", "F", 9000));
        System.out.println("Top 3 Highest paid Employees");

        emplst.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2)
                .forEach(System.out::println);

        System.out.println("First Two Emplyee");

        emplst.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Lowest Two Salaried Employees");

        emplst.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(2)
                .forEach(System.out::println);


        System.out.println("First 5 Employees Names");

        emplst.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
