package ashraf.java8.programs;

import java.util.Arrays;
import java.util.List;

public class ReplaceDigitStartsWith1 {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(12,11,34,56,77,112);
        lst.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .forEach(System.out::println);
    }
}
