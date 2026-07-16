package ashraf.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceDigitStartsWith1 {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(12,11,34,56,77,112,74);
        lst.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .forEach(System.out::println);

//        Numbere ends with 4

        System.out.println("emds with logic using collecto to list store in list of String");

    List<String>res=    lst.stream()
                .map(String::valueOf)
                .filter(s->s.endsWith("4"))
                .collect(Collectors.toList());

        System.out.println(res);


        System.out.println("using for each");

        lst.stream()
                .map(String::valueOf)
                .filter(n -> n.endsWith("6"))
                .forEach(System.out::println);


        System.out.println("WAnt output in Integer");

       List<Integer>res1= lst.stream()
                .filter(n->String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(res1);


        System.out.println("Count the specific filtered value");

     Long res2=   lst.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("7"))
                .count();

        System.out.println(res2);

    }
}
