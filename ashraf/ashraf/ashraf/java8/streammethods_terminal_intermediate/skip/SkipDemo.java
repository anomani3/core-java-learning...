package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.skip;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,5,6,7,8,10,8,10,12,14,16,18,17,19,20);

        System.out.println("Skip first 3 numbers");

        list.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("Skip first 2 names");

        List<String> names = Arrays.asList(
                "Ashraf",
                "Arish",
                "Manju",
                "Rahul",
                "Zaki"
        );

        names.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("Skip first five even Numbers");

        list.stream()
                .filter(l->l%2==0)
                .skip(5)
                .forEach(System.out::println);
    }
}
