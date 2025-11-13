import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String>list=Arrays.asList("Ashraf","weds","farmat");
        list.forEach(name->System.out.println(name));

        List<Integer>max=Arrays.asList(10,20,30,40);
int maximum=max.stream().max(Integer::compare).orElse(0);
System.out.println(maximum);
 
 
List<String>list1=Arrays.asList("shadab","ashraf");
List<String>upperCase=list1.stream().map(String::toUpperCase).collect(Collectors.toList());
upperCase.forEach(e->System.out.println(e));
        
    }
 
    
}
