// package .vscode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        System.out.println("hello");
        List<String>words=Arrays.asList("apple","banana","apple");
Map<String,Long>wordCount=words.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
System.out.println(wordCount);

List<Integer>numers=Arrays.asList(1,2,3,4);
int sums=numers.stream().reduce(0,Integer::sum);
System.out.println(sums);
    }

    
}
