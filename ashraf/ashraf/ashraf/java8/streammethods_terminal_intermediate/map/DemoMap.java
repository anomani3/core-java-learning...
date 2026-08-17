package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoMap {

    public static void main(String[] args) {

        List<Integer>lst= Arrays.asList(1,2,3,4,5,6,7,7,8,9);

        System.out.println("Square of each number");

        //filter()-> keep only what I need

        //map()-> convert each item into semething else



        lst.stream()
                .map(l -> l * l)
                .forEach(System.out::println);

        System.out.println("Multiply each by 10");

        lst.stream()
                .map(n->n*10)
                .forEach(System.out::println);

        List<String> str = Arrays.asList("ashraf", "mosharraf", "arish", "kashif");
        System.out.println("Convert to upeer case");

        str.stream()
                .map(n->n.toUpperCase())
                .forEach(System.out::println);

        System.out.println("Find length of each string");

        str.stream()
                .map(String::length)
                .forEach(System.out::println);

        Map<String,Integer> res=str.stream()
                .collect(Collectors.toMap(n->n,n->n.length()));

        System.out.println(res);

    }
}
