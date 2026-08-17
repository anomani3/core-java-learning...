package ashraf.ashraf.ashraf.ashraf.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfMailAndFemaleEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(1, "AShraf", "M"), new Employee(1, "Kaju", "F"), new Employee(3, "Maju", "F"), new Employee(4, "Namu", "F"));

        Map<String, Long> res = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));

        System.out.println(res);

        List<Employee> employees1=Arrays.asList(
                new Employee(8,"Manju","F"),
                new Employee(9,"panju","M"),
                new Employee(10,"Sanju","M")
        );

        Map<String,Long> res1=employees1.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));
        System.out.println(res1);

    }
}
