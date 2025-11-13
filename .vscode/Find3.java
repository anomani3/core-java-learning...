import java.util.Arrays;
import java.util.List;

public class Find3 {
    public static void main(String[] args) {
        // List<Integer>findthreeElememt = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer>findthreeElememt = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        List<Integer>findThreeMin=findthreeElememt.stream().sorted().limit(3).forEach(System.out::println);
 
 
    }
    
}
