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
                new Employee(3,"Arish","Pharmacy","M",6000),
                new Employee(4,"Kaju","Mechanical","M",10000),
                new Employee(5,"Raju","IT","F",3000),
                new Employee(6, "Priya", "Finance", "F", 15000),
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
                new Employee(25, "Deepak", "Marketing", "M", 16500),
                new Employee(26, "Bhavana", "HR", "F", 8500),
                new Employee(27, "sohit", "Sales", "M", 9500),
                new Employee(28, "Nisha", "IT", "F", 24000),
                new Employee(29, "Arun", "Pharmacy", "M", 15500),
                new Employee(30, "Keerthi", "Finance", "F", 20000)
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

        System.out.println("Salary between 3 to 7 thousand");

        emplst.stream()
                .filter(e->e.getSalary()>3000 &&
                        e.getSalary()<7000)
                .forEach(System.out::println);

        System.out.println("Find male employeees");

        emplst.stream()
                .filter(e->e.getGender().equalsIgnoreCase("M"))
                .forEach(System.out::println);

        System.out.println("Female Employees");

        emplst.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("F"))
                .forEach(System.out::println);

        System.out.println("IT Department Employee");

        emplst.stream()
                .filter(m->m.getDepartment().equalsIgnoreCase("IT"))
                .forEach(System.out::println);


        System.out.println("HR Department with salary > 4000");

        emplst.stream()
                .filter(e->e.getDepartment().equalsIgnoreCase("HR") &&
                        e.getSalary()>4000)
                .forEach(System.out::println);


        System.out.println("Employee name starts with S");

        emplst.stream()
                .filter(e->e.getName().contains("S"))
                .forEach(System.out::println);

        System.out.println("emp name with equal ignore case");

        emplst.stream()
                .filter(e->e.getName().toLowerCase().startsWith("s"))
                .forEach(System.out::println);

        System.out.println("emp name contains na");

        emplst.stream()
                .filter(m -> m.getName().contains("na"))
                .forEach(System.out::println);

        System.out.println("Employee id greater than 20");

        emplst.stream()
                .filter(e->e.getId()>20)
                .forEach(System.out::println);


        System.out.println("Employees with even Ids");

        emplst.stream()
                .filter(e -> e.getId() % 2 == 0)
                .forEach(System.out::println);


    }
}
