package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.distinct;

import java.util.Arrays;
import java.util.List;

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


        System.out.println("");
    }
}
