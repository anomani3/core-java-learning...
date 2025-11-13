import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>>nestedList=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8));
 
List<Integer>flatList=nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
System.out.println(flatList);
 
 
// 2nd Highest number in a list
List<Integer>numbers=Arrays.asList(10,20,30,40,50);   
//  50 40 30 20 10
int secondHighest=numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()->new RuntimeException("No second hightest found"));
System.out.println(secondHighest);
        
    }

}
