package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.sort;

import ashraf.ashraf.ashraf.ashraf.java8.HighestSalary;
import ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallife_employee_example.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEmployeeDemo {
    public static void main(String[] args) {
        List<Employee> emplst= Arrays.asList(
                new Employee(1,"Ashraf","IT","M",12000),
                new Employee(2,"Manju","HR","F",7000),
                new Employee(3,"Arish","Pharmacy","M",6000),
                new Employee(4,"Kaju","Mechanical","M",10000),
                new Employee(5,"Raju","IT","F",3000),
                new Employee(6, "Priya", "Finance", "F", 15000),
                new Employee(7, "Rahul", "IT", "M", 18000),
                new Employee(8, "Sneha", "HR", "F", 9000)
        );

        System.out.println("Total Salary");

     double totalSal=   emplst.stream()
                .map(Employee::getSalary)
                .reduce(0.0,(a,b)->a+b);

        System.out.println(totalSal);


        System.out.println("Highest Salary");

       Optional<Double> highestSal= emplst.stream()
                .map(Employee::getSalary)
                .reduce(Double::max);

        highestSal.ifPresent(System.out::println);


        System.out.println("Total Salary of IT Employee");
         Optional<Double> ITHS=   emplst.stream()
                    .filter(e->e.getDepartment().equalsIgnoreCase("IT"))
                    .map(Employee::getSalary)
                    .reduce(Double::max);

        System.out.println(ITHS);

        System.out.println("Total salary above 5000");

      double salarygrreater5k=  emplst.stream()
                .filter(e->e.getSalary()>5000)
                .map(Employee::getSalary)
                .reduce(0.0,Double::sum);

        System.out.println(salarygrreater5k);

        System.out.println("");
    }
}
