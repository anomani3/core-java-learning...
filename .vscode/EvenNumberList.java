import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumberList {
    public static void main(String[] args) {
        List<Integer>evenNumber=Stream.iterate(0,n->n+2).limit(6).collect(Collectors.toList());
System.out.println(evenNumber);
 
 
List<Integer>list=Arrays.asList(10,20,30);
boolean allGreater=list.stream().allMatch(n->n>5);
System.out.println(allGreater);
    }
    
}
