import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + ":" + salary;
    }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("ashraf", 5000),
                new Employee("nomani", 4000),
                new Employee("shadab", 3000));

        List<Employee> sorted = emp.stream().sorted(Comparator.comparingInt(e -> e.salary))
                .collect(Collectors.toList());
        System.out.println(sorted);



        String s="ashraf";

Character charcater=s.chars().mapToObj(c->(char)c).filter(ch->s.indexOf(ch)==s.lastIndexOf(ch)).findFirst().orElse(null);

System.out.println(charcater);


Charcater chs=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
Collectors.counting())).entrySet()
.stream().filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).findFirst().get();

System.out.println(chs);
 
 
    }

}
