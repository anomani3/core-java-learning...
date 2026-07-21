package ashraf.java8.programs;

import java.util.Arrays;
import java.util.List;

public class FindSquaeOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,2,3,4,5,6,7,8);
        lst.stream()
                .filter(n -> n % 2 == 0).map(n -> n * n)
                .forEach(System.out::println);
    }
}
