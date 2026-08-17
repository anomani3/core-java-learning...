package ashraf.ashraf.ashraf.ashraf.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSalary {
    public static void main(String[] args) {

        List<Employee> emp= Arrays.asList(
                new Employee(1,"AShraf",900000,"IT"),
                new Employee(2,"Raja",80000,"Finance"),
                new Employee(3,"abaja",70000,"IT")
        );
        emp.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

    }
}
