package ashraf.ashraf.ashraf.ashraf.java8;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSalFromEachDept {
    public static void main(String[] args) {
        List<Employee> emp= Arrays.asList(
                new Employee(1,"AShraf",900000,"IT"),
                new Employee(2,"Raja",80000,"Finance"),
                new Employee(3,"abaja",70000,"IT"),
                new Employee(4,"Akram",200000,"Finance")
        );

  Map<String, Optional<Employee>> res= emp.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(
                        Comparator.comparing(Employee::getSalary)
                )));

//        res.forEach((dept,emp))->
//        System.out.println(dept+"->"+ emp.get((1)));
    }
}
