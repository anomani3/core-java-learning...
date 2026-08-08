package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {


//        1. What is reduce()?
//
//                reduce() is used when you want to combine multiple elements into one single result.

        System.out.println("Sum Of Numbers");

        List<Integer> nums= Arrays.asList(1,3,4,5,6,7,8,10);

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

    }
}
