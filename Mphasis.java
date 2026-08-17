package ashraf;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//st<List<String>> listOfLists = Arrays.asList(
//        Arrays.asList("1", "2"),
//        Arrays.asList("3", "4"),
//        Arrays.asList("5", "6")
//);
//Expected Output: 1,2,3,4,5,6
public class Mphasis {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("1", "2"),
                Arrays.asList("3", "4"),
                Arrays.asList("5", "6")
        );

        List<String> result = listOfLists.stream()
                .map(list -> String.join(",", list)) // join each sublist
                .collect(Collectors.toList());

        System.out.println(result); // Output: [1,2, 3,4, 5,6]

    }
}
