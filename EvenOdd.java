package ashraf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   Map<Boolean,List<Integer>>res= lst.stream()
                .collect(Collectors.groupingBy(
                n->n%2==0
                ));

        System.out.println("Even:  "+res.get(true));

        System.out.println("Odd: "+ res.get(false));


        Map<Boolean,List<Integer>> res1=lst.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even:  "+res1.get(true));

        System.out.println("Odd:  "+res1.get(false));


    }
}
