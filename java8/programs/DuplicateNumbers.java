package ashraf.java8.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(11,12,21,11,1,1,4,4);

        Set<Integer> unique=new HashSet<>();

      List<Integer> duplicates=  lst.stream()
                .filter(n->!unique.add(n))
                .collect(Collectors.toList());

        System.out.println(duplicates);

        System.out.println("Count occurance of each numbers");


        Map<Integer,Long> freq=lst.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(freq);
    }
}
