package ashraf.ashraf.ashraf.ashraf.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class AverageSalary{

    public static void main(String[] args) {
        List<Employee> lst= Arrays.asList(
          new Employee(1,"Changu",2000,"IT"),
                new Employee(2,"dhangu",2000,"IT"),
                new Employee(3,"fhangu",5000,"HR"),
                new Employee(4,"hhangu",7000,"HR"),
                new Employee(5,"jhangu",8000,"IT")



        );

    Map<String,Double> res=lst.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));


        System.out.println(res);
    }

}
