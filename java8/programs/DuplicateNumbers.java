package ashraf.java8.programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(11,12,21,11,1,1,4,4);

        Set<Integer> usique=new HashSet<>();

      List<Integer> duplicates=  lst.stream()
                .filter(n->!usique.add(n))
                .collect(Collectors.toList());

        System.out.println(duplicates);

    }
}
