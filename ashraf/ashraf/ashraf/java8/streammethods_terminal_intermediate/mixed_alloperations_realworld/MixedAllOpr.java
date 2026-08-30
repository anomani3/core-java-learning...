package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.mixed_alloperations_realworld;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.*;
import java.util.stream.Collectors;


import static java.util.Arrays.stream;

public class MixedAllOpr {
    public static void main(String[] args) {


        List<Employee> emplst = Arrays.asList(
                new Employee(1, "Ashraf", "IT", "M", 12000),
                new Employee(2, "Manju", "HR", "F", 7000),
                new Employee(3, "Arish", "Pharmacy", "M", 6000),
                new Employee(4, "Kaju", "Mechanical", "M", 10000),
                new Employee(5, "Raju", "IT", "F", 3000),
                new Employee(6, "Priya", "Finance", "F", 15000),
                new Employee(7, "Rahul", "IT", "M", 18000),
                new Employee(8, "Sneha", "HR", "F", 9000)
        );

        List<Order> orders = Arrays.asList(

                new Order(101, "Ashraf", "COMPLETED", 15000, "UPI"),
                new Order(102, "Rahul", "PENDING", 8500, "CARD"),
                new Order(103, "Priya", "COMPLETED", 22000, "CARD"),
                new Order(104, "John", "CANCELLED", 5000, "COD"),
                new Order(105, "Amit", "COMPLETED", 12000, "UPI"),

                new Order(106, "Ashraf", "COMPLETED", 18000, "CARD"),
                new Order(107, "Priya", "PENDING", 7500, "UPI"),
                new Order(108, "Rahul", "COMPLETED", 30000, "CARD"),
                new Order(109, "Neha", "COMPLETED", 9500, "COD"),
                new Order(110, "Amit", "CANCELLED", 4000, "UPI"),

                new Order(111, "John", "COMPLETED", 27000, "CARD"),
                new Order(112, "Neha", "PENDING", 6500, "COD"),
                new Order(113, "Ashraf", "COMPLETED", 45000, "UPI"),
                new Order(114, "Rahul", "CANCELLED", 3000, "CARD"),
                new Order(115, "Priya", "COMPLETED", 16000, "UPI"),

                new Order(116, "Amit", "COMPLETED", 25000, "CARD"),
                new Order(117, "Neha", "COMPLETED", 11000, "COD"),
                new Order(118, "John", "PENDING", 9000, "UPI"),
                new Order(119, "Rahul", "COMPLETED", 55000, "CARD"),
                new Order(120, "Ashraf", "CANCELLED", 7000, "COD"),

                new Order(121, "Priya", "COMPLETED", 35000, "CARD"),
                new Order(122, "Amit", "PENDING", 8000, "UPI"),
                new Order(123, "Neha", "COMPLETED", 19000, "COD"),
                new Order(124, "John", "COMPLETED", 42000, "CARD"),
                new Order(125, "Rahul", "PENDING", 6000, "UPI"),

                new Order(126, "Ashraf", "COMPLETED", 28000, "CARD"),
                new Order(127, "Priya", "CANCELLED", 4500, "COD"),
                new Order(128, "Amit", "COMPLETED", 32000, "UPI"),
                new Order(129, "Neha", "PENDING", 10000, "CARD"),
                new Order(130, "John", "COMPLETED", 50000, "UPI")
        );

        System.out.println("Employees salary greater than 5000");

        emplst.stream()
                .filter(e -> e.getSalary() > 5000)
                .forEach(System.out::println);


        System.out.println("Get only employees Names");

        emplst.stream()
                .map(Employee::getName)
                .forEach(System.out::println);


        System.out.println("Get only It employees names");


        emplst.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .map(Employee::getName)
                .forEach(System.out::println);


        System.out.println(" find unique departments");

        String s = "Welcome";
        String sv = "Welcome";

        System.out.println(s.equals(sv));

        System.out.println("Hashcode value");
        System.out.println(s.hashCode());
        System.out.println(sv.hashCode());

        System.out.println(s == sv);

        int i = 128;
        int j = 128;
        Integer k = 128;
        Integer l = 128;

        System.out.println("integer");

        System.out.println(k.equals(l));
        System.out.println(k == l);

        System.out.println(k.hashCode());

        System.out.println(l.hashCode());
        System.out.println(i == j);
        System.out.println("Hashcode value of String with new keyword");

        String sn = new String("Hello");
        String sn1 = new String("Hello");

        System.out.println(sn.hashCode());
        System.out.println(sn1.hashCode());


        System.out.println("Find unique departments");

        emplst.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);


        System.out.println("EMployee name starting with a");

        emplst.stream()
                .filter(e -> e.getName().toLowerCase().startsWith("a"))
                .forEach(System.out::println);


        System.out.println("Level 2");

        System.out.println("Sort employee by salary ascending order");

        emplst.stream()
                .map(Employee::getSalary)
                .sorted()
                .forEach(System.out::println);


        System.out.println("Sort slary By descending order");

        emplst.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("Sort Employee by name");

        emplst.stream()
                .map(Employee::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("sort by department then salary");

        Map<String, List<Double>> res = emplst.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.mapping(
                        Employee::getSalary, Collectors.toList()
                )));
        res.values().forEach(Collections::sort);

        System.out.println(res);

        System.out.println("Level 3");

        System.out.println("Highest paid employees");

        emplst.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("Second highest salary");
        Optional<Double> reshs = emplst.stream()
                .map(Employee::getSalary)

                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(reshs);

        System.out.println("Third Highest salry");

        Optional<Double> res2ndHS = emplst.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
        res2ndHS.ifPresent(System.out::println);

        System.out.println("Top 3 Highest paid employees");

        emplst.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Lowest threesalaries");

        emplst.stream()
                .map(Employee::getSalary)
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Level 4");

        System.out.println("Group Employee by department");

        Map<String, List<Employee>> grpEmpList = emplst.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

       grpEmpList.forEach((dept,emp)->{
            System.out.println(dept+" :"+ emp);
    });

        System.out.println("count employee in each department");

       Map<String,Long> rescount= emplst.stream()

                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));

        System.out.println(rescount);

        System.out.println("Average salary by department");

        Map<String, Double> resAvg = emplst.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(resAvg);

        System.out.println("Maximum salary in each department");


        System.out.println("Level 6");

        System.out.println("List olf completed orders");

        orders.stream()
                .filter(o->o.getOrderStatus().equalsIgnoreCase("COMPLETED"))
                .forEach(System.out::println);


        System.out.println("Second Highest number from list");

        List<Integer> ilst=Arrays.asList(1,2,10,1,34,24,0,25);
       Optional<Integer> ires= ilst.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();
        System.out.println(ires);
    }
}