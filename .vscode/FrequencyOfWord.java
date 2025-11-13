import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequencyOfWord {
    public static void main(String[] args) {
        // find the frequency of characters in a string by using stream api
 
String str="java";
 
Map<Object,Long>frequencyOfWord=str.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(c->c,Collectors.counting()));
System.out.println(frequencyOfWord);
String sentance="Java is fun and Java is powerful";
Map<String,Long>wordCount=Arrays.stream(sentance.split(" ")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
System.err.println(wordCount);
    }
    
}
