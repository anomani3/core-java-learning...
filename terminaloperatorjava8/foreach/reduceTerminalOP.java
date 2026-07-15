package ashraf.terminaloperatorjava8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class reduceTerminalOP {
    public static void main(String[] args) {
//        map()--> is used to transform each element of stream into another element
        //The number of elements are remains the same But the value structure or even can type change

        //Convert numbers to the squares

        List<Integer> lst= Arrays.asList(1,2,5,7,9,10);

      List<Integer>sqrList=  lst.stream()
                .map(n->n*n)
                .collect(toList());

        System.out.println(sqrList);


        //Convert Lower case to upper case
        List<String> names=Arrays.asList("ashraf","chandu","mandu");
            List<String> namesInUpper=        names.stream()
                            .map(n->n.substring(0,1).toUpperCase()+
                                    n.substring(1).toLowerCase())
                            .collect(toList());

        System.out.println(namesInUpper);


        List<Integer> intLIst=Arrays.asList(1,2,3,5,7,9);
            int sum =intLIst.stream()
                                .reduce(0,Integer::sum);

        System.out.println(sum);
    }
}
