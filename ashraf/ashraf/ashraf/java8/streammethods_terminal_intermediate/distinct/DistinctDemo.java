package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.distinct;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        System.out.println("REmove Duplicate numbers ");

        List<Integer> lst= Arrays.asList(1,1,2,3,4,4,5,6,5,1);
        lst.stream()
                .distinct()
                .forEach(System.out::println);


        System.out.println("Remove Duplicate Strings");

        List<String> str=Arrays.asList("Ashraf","Farhat","Arish","Farhat","Arish");

        str.stream()
                .map(s->s.toLowerCase())
                .distinct()
                .forEach(System.out::println);


        System.out.println("Remove Duplicate EvenNumbers");

        lst.stream()
                .filter(n->n%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Distinct Odd numbers");

        System.out.println("Remove Duplicate odd");

        lst.stream()
                .filter(l->l%2!=0)
                .distinct()
                .forEach(System.out::println);


        System.out.println("Some EMployee example  based on real world");

        List<Employee> emplst= Arrays.asList(
                new Employee(1,"Ashraf","IT","M",12000),
                new Employee(2,"Manju","HR","F",7000),
                new Employee(3,"Arish","Pharmacy","M",7000),
                new Employee(4,"Kaju","Mechanical","M",10000),
                new Employee(5,"Raju","IT","F",3000),
                new Employee(6, "Arish", "Finance", "F", 15000),
                new Employee(7, "Rahul", "IT", "M", 18000),
                new Employee(8, "Sneha", "HR", "F", 9000),
                new Employee(9, "Amit", "Sales", "M", 14000),
                new Employee(10, "Neha", "Marketing", "F", 11000),
                new Employee(11, "Vijay", "Finance", "M", 25000),
                new Employee(12, "Pooja", "IT", "F", 16000),
                new Employee(13, "Kiran", "Mechanical", "M", 8000),
                new Employee(14, "Divya", "HR", "F", 5000),
                new Employee(15, "Suresh", "Sales", "M", 21000),
                new Employee(16, "Anjali", "Marketing", "F", 17000),
                new Employee(17, "Ramesh", "IT", "M", 9000),
                new Employee(18, "Komal", "Finance", "F", 13000),
                new Employee(19, "Naveen", "Pharmacy", "M", 7500),
                new Employee(20, "Meena", "Sales", "F", 19500),
                new Employee(21, "Harish", "HR", "M", 10000),
                new Employee(22, "Swathi", "IT", "F", 22000),
                new Employee(23, "Ajay", "Mechanical", "M", 12500),
                new Employee(24, "Lavanya", "Finance", "F", 14500),
                new Employee(25, "Deepak", "Marketing", "M", 16500)
        );

        System.out.println("Distinct Employee department");

        emplst.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Distinct Salaries");

        emplst.stream()
                .map(Employee::getSalary)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Filterf + Distinct");

        emplst.stream()
                .filter(e->e.getSalary()>10000)
                .map(Employee::getSalary)
                .distinct()
                .forEach(System.out::println);
        System.out.println("Sorted + distinct");

        System.out.println("Distinct Employee Names in Upper case");

        emplst.stream()
                .map(e->e.getName().toUpperCase())
                .distinct()
                .forEach(System.out::println);

        System.out.println("Remove duplicate names and store in set");

        Set<String> res=emplst.stream()
                .map(e->e.getName())
                .distinct()
                .collect(Collectors.toSet());

        System.out.println(res);

        System.out.println("");

    }
}
