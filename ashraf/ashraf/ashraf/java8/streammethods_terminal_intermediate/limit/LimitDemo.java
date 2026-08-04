package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.limit;

import java.util.Arrays;
import java.util.List;

public class LimitDemo {
    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(1,2,4,5,6,5,77,4,44,30);

        System.out.println("Find first threee elements");

        lst.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
