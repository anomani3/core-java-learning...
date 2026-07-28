package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.filter;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;



public class FilterDemo {
    public static void main(String[] args) {
        List<Integer>lst= Arrays.asList(1,2,3,4,5,5,6,8,20,50,9,10,80);

        List<String> lst1 = Arrays.asList("Ashraf", "Arish", "", "", "Juber", "aiman", "Zaki", "Joya");

        List<String> lst2=Arrays.asList("Ashraf","Arish",null,null,"Juber","aiman","Zaki","Joya");

        System.out.println("************************************Answer Started*******************************");

        System.out.println("Print Even Number");
        lst.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

        System.out.println("print Odd Number");

       List<Integer> res= lst.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println(res);


        System.out.println("Numbers Greater Than 10");


        lst.stream()
                .filter(n->n>10)
                .forEach(System.out::println);


        System.out.println("Numbers Less Than 50");

        lst.stream()
                .filter(n -> n < 50)
                .forEach(System.out::println);


        System.out.println("String Starts with A ,a");

        lst1.stream()
                .filter(n->n.toLowerCase().startsWith("a"))
                .forEach(System.out::println);


        System.out.println("Endswith n");

        lst1.stream()
                .filter(n -> n.endsWith("n"))
                .forEach(System.out::println);

        System.out.println("String Length greater than 5");

        lst1.stream()
                .filter(n -> n.length() > 5)
                .forEach(System.out::println);

        System.out.println("REmove Empty String");

        lst1.stream()
                .filter(n->!n.isEmpty())
                .forEach(System.out::println);

        System.out.println("REmove null values");

        lst2.stream()

                .filter(Objects::nonNull)
                .forEach(System.out::println);

    }





}
