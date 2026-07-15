package ashraf.java8.features.functionalinterfaceex.runnableDemo;

import ashraf.Employee;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven=n->n%2==0;

        System.out.println(isEven.test(20));
        System.out.println(isEven.test(9));

        Employee e1=new Employee("Ashraf","It",20000);
        Employee e2=new Employee("kaju","It",4999);

        Predicate<Employee> isEligible=e->e.getSalary()>5000;

        System.out.println(isEligible.test(e2));


    }
}
