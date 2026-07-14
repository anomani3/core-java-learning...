package ashraf.java8.features.java17.sealedClassesFeature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
//        1 2 3 4 2 3
        List<Integer>lst= Arrays.asList(1,2,3,4,2,3,4);
        lst.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(ee-> System.out.println(ee.getKey()
                ));

        System.out.println("In a very simple ways");

        Set<Integer> unique=new HashSet<>();
        Set<Integer> result=
                lst.stream()
                        .filter(e->!unique.add(e))
                        .collect(Collectors.toSet());
        System.out.println(result);

    }
}
