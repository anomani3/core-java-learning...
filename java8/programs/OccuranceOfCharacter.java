package ashraf.java8.programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharacter {
    public static void main(String[] args) {

        String str="I am a Java Developer ,Its very good Language";

        Map<Character,Long> result=str.replaceAll("\s+","")
                .toLowerCase()
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        result.forEach((ch,count)->
                System.out.println(ch+" = "+count));
    }
}
