package ashraf.java8.features;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class EvenOddUsingSingleStreams {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,2,3,5,6,8,10);
        //print even odd in single streans

        Map<Boolean,List<Integer>> result=lst.stream()
                .collect(Collectors.groupingBy(l->l%2==0));

        System.out.println("Even Numbers: "+result.get(true));
        System.out.println("Odd Number: "+result.get(false));

        //Using filter

        System.out.println("Usng filter");

        System.out.println("Even Number");

       lst.stream()
                .filter(l->l%2==0)
                .forEach(System.out::println);


        System.out.println("Odd number");

        lst.stream()
                .filter(l->l%2!=0)
                .forEach(System.out::println);


        //Using PartionBy

        System.out.println("Using Partition By");

   Map<Boolean,List<Integer>> res=     lst.stream()
                .collect(Collectors.partitioningBy(l->l%2==0));

        System.out.println("EvenNumber :"+res.get(true));
        System.out.println("Odd Number:  "+res.get(false));

    }
}
