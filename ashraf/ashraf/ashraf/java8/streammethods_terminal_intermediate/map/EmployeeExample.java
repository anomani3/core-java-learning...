package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.map;

import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("checking git commit and pushgit ");

        employeeList.stream()
                .map(e -> e.getSalary() * 1.10)
                .forEach(System.out::println);


        System.out.println("Get employee department");

        employeeList.stream()
                .map(Employee::getDepartment)
                .forEach(System.out::println);

        System.out.println("EMployee name and salary");

        employeeList.stream()
                .map(e->e.getName()+" "+ e.getSalary())
                .forEach(System.out::println);

        System.out.println("FirstCharacter of names");

        List<String> names = Arrays.asList("    Ashraf", "Farhat  ", "Arish ", "Harish", " Zeeshan");
        names.stream()
                .map(n->n.toLowerCase().charAt(0))
                .forEach(System.out::println);

        System.out.println("Reverse every String");

        names.stream()
                .map(n->new StringBuffer(n).reverse().toString())
                .forEach(System.out::println);

        System.out.println("Trim Spaces");

        names.stream()
                .map(String::trim)
                .forEach(System.out::println);

        System.out.println("Convert marks to grades");

        List<Integer> marks=Arrays.asList(90,70,30,50,60,77,88,90);

        marks.stream()
                .map(m->m>80 ? "A": "B")
                .forEach(System.out::println);

        System.out.println("mixing of map and filter");

        System.out.println("Find the name of emp whose salary is greater than 7000");

        employeeList.stream()
                .filter(e->e.getSalary()>7000)
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("Collect named into list");

        List<String> res=employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(res);

    }
}
