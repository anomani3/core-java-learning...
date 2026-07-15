package ashraf.terminaloperatorjava8.foreach;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ForEachTermOp {
//    Print all name from the list

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alis","Bob","Tob","Cob");
                        names.stream().forEach(System.out::println);


//                        count occurance of eacj character

        String str="Programming";
        Map<Character,Long> frequencyMap=str.chars()
                .mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        System.out.println(frequencyMap);

        String s1="Hello  India";
        Map<Character,Long> freq=s1.replaceAll("\\s+","")
                .chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(freq);


        List<Integer> lst=Arrays.asList(10,20,30,40,50,60);

//        Consumer<Integer> obj=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//
//                    System.out.println(integer);
//                }
//
//
//        };
//        lst.forEach(obj);
        lst.forEach(System.out::println);
        lst.forEach(n-> System.out.print(n+" "));


    }

}
