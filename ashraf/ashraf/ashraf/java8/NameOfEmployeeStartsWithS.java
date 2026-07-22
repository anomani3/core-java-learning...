package ashraf.ashraf.ashraf.ashraf.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameOfEmployeeStartsWithS {

    public static void main(String[] args) {
        List<Employee> lst= Arrays.asList(
                new Employee(1,"Salma","F"),
                new Employee(3,"Sultana","F"),
                new Employee(4,"Kaju","M")
        );
 List<Employee> res=       lst.stream()
                .filter(e->e.getName().startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
