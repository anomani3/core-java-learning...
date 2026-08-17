package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallifestudent_examples;

import java.util.*;

public class GeneralQuestions {

    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(1,2,3,11,55,66,16,100,100,3,1);

        List<Integer> lst1=Arrays.asList(-1,-2,4,-5,8,0,7);

        System.out.println("Number starts with 1");

        lst.stream()
                .filter(s->String.valueOf(s).startsWith("1"))
                .forEach(System.out::println);

        System.out.println("Number Ending with 0");

        lst.stream()
                .filter(s->String.valueOf(s).endsWith("0"))
                .forEach(System.out::println);


        System.out.println("Duplicate numbers");

        Set<Integer> nset=new HashSet<>();

        lst.stream()
                .filter(s->! nset.add(s))
                .forEach(System.out::println);


        System.out.println("Remove Duplicates");

        lst.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("find positive numbers");

        lst1.stream()
                .filter(n->n>0)
                .forEach(System.out::println);


        System.out.println("Negative Numbers");

        lst1.stream()
                .filter(n->n<0)
                .forEach(System.out::println);

        System.out.println("Longest String");

        List<String> str=Arrays.asList("Pomegranate","Apple","","Mangoo","Carroot","Cucumber");

        str.stream()
                .filter(w->w.length()>5)
                .forEach(System.out::println);

        System.out.println("Ignore spaces");

        str.stream()
                .filter(s->!s.trim().isEmpty())
                .forEach(System.out::println);

        System.out.println("Word containing oo");

        str.stream()
                .filter(s->s.contains("oo"))
                .forEach(System.out::println);

        System.out.println("");

        System.out.println("Longest String ************");

        String res=   str.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);

        System.out.println(res);


    }
}
