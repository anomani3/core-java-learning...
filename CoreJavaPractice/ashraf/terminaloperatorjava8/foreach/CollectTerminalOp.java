package ashraf.terminaloperatorjava8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectTerminalOp {
    public static void main(String[] args) {
        List<Integer>lst= Arrays.asList(10,20,30,40,50,60);
      List<Integer> Listgreater10=  lst.stream()
                .filter(n->n>10)
                .collect(Collectors.toList());
        System.out.println(Listgreater10);
    }
}
