package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.sort;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SortDemo {
    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(10,100,1000,700,1,5,3,6,8,1);
        System.out.println("Sorting in Ascending Ordcer ");
        lst.stream()
                .sorted()
//                .distinct()
                .forEach(System.out::println);


        System.out.println("Sorting in decending order");


        lst.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(System.out::println);


        System.out.println("Sort String Alphabatically");

        List<String> names=Arrays.asList("Nomani","AShraf","Helal","Belal","kaju","Kallu");

        names.stream()
                .map(n->n.toLowerCase())
                .sorted()
                .forEach(System.out::println);


        System.out.println("Sort String in Reverse Order");

        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        System.out.println("Sort String by length");

        names.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        System.out.println("sort String by length Decending order");

        names.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);


        System.out.println("Employee class example");


        List<Employee> empList = Arrays.asList(
                new Employee(1,"Ashraf","IT","M",12000),
                new Employee(2,"Manju","HR","F",7000),
                new Employee(3,"Arish","IT","M",6000),
                new Employee(4,"Raju","Sales","M",18000),
                new Employee(5,"Neha","HR","F",9000)
        );

        System.out.println("sort Salasry ascending order");

        empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);


        System.out.println("Sort salary bydecending order");

        empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);


        System.out.println("Sort by name");

       String s="I am a good boy I am not a good boy";

        Set<String> set=new HashSet<>();


        Arrays.stream(s.split(" "))
                .filter(word -> !set.add(word.toLowerCase()))
                .forEach(System.out::println);

        System.out.println("Count Duplicate words");

        Arrays.stream(s.split(" "))

                .collect(Collectors.groupingBy(
                        w->w,
                        Collectors.counting())
                )
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(System.out::println);

        System.out.println("Print duplicate words");

        Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(
                        w->w,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
