package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {


//        1. What is reduce()?
//
//                reduce() is used when you want to combine multiple elements into one single result.

        System.out.println("Sum Of Numbers");

        List<Integer> nums= Arrays.asList(1,3,4,5,6,21,7,8,10,18,20);

        int res = nums.stream()
                .reduce((a, b) -> a + b)
                .orElse(0);
        System.out.println(res);

        System.out.println("Sum using method Reference");

       int res1= nums.stream()
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(res1);


        System.out.println("Sum using Identity Value");

        int res2=nums.stream()
                .reduce(0,(a,b)->a+b);

        System.out.println(res2);


        System.out.println("Find maximum Numbers");

      int res3=  nums.stream()
                .reduce(Integer::max)
                .orElse(0);

        System.out.println(res3);


        System.out.println("Find Minimum");

        List<Integer> lst=Arrays.asList(1,2,4,6,-1);

        int res4=lst.stream()
                .reduce(Integer::min)
                .orElse(0);

        System.out.println(res4);

        System.out.println("Multiplay all Numbers");

        int res5=lst.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(res5);

        System.out.println("Find sum of Even Numbers");

     Optional<Integer> res6=  nums.stream()
                .filter(n->n%2==0)
//                .reduce(0,(a,b)->a+b);

        .reduce(Integer::sum);

        System.out.println(res6);


        System.out.println("Sum of numbers greater than 10");

       int res7= nums.stream()
                .filter(n->n>10)
                .reduce(0,(a,b)->a+b);

        System.out.println(res7);

        List<String> names = Arrays.asList(
                "Ashraf",
                "Arish",
                "SpringBoot",
                "AWS"
        );

        System.out.println("Find Longest String");

        String sres=names.stream()
                .reduce("",(a,b)->a.length() > b.length() ? a:b);

        System.out.println(sres);


        System.out.println("Find Shortest String");

     String shortestStr=names.stream()
                .reduce("",(a,b)->
                        a.length() < b.length() ? a : b);

        System.out.println(shortestStr);


        System.out.println("Concatinate String");

       String conct= names.stream()
                .reduce("",(a,b)->a+b);

        System.out.println(conct);

        System.out.println("Concatinate with spaces");

        String concres=names.stream()
                .reduce("",(a,b)->a+" "+b);
        System.out.println(concres);
    }
}
