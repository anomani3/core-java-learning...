package ashraf.java8;

import ashraf.java8.programs.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<ashraf.java8.programs.Employee> employee= Arrays.asList(
                new Employee(1,"Ashraf",4000,"IT"),
                new Employee(2,"Hacjer",7788,"IT"),
                new Employee(3,"Kaju",80000,"Finance"),
                new Employee(4,"Raju",90000,"Finance")
        );

  Employee secondHighest=      employee.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest);

    }





}
